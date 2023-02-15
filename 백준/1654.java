import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer token = new StringTokenizer(bf.readLine());

		int k = Integer.parseInt(token.nextToken()); // 가지고 있는 랜선의 개수
		int n = Integer.parseInt(token.nextToken()); // 필요한 랜선의 개수

		int[] arr = new int[k];

		int min = 0; // 길이의 최소값
		int max = 0; // 입력받은 값 중 최댓값

		for (int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
			if (arr[i] > max)
				max = arr[i];
		}

		/*
		 * 이분 탐색의 범위는 랜선의 길이
		 * key값 == 만들고자 하는 랜선 개수(N)
		 * => 특정 개수에 대한 특정 길이 찾기
		 */

		int mid = 0;
		while (max > min) {
			mid = (max + min) / 2;

			int count = 0;

			// 중간 길이로 잘랐을 때 총 몇개의 랜선이 만들어지는지 확인
			for (int i = 0; i < k; i++) {
				count += arr[i] / mid;
			}

			if (n < count)
				min = mid;
			else
				max = mid + 1;

		}

		System.out.println(mid);
	}
}
