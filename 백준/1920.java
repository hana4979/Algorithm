import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		int[] arr = new int[n];

		StringTokenizer addToken = new StringTokenizer(bf.readLine());

		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(addToken.nextToken());

		Arrays.sort(arr); // 배열 정렬

		int m = Integer.parseInt(bf.readLine()); // 몇 개 비교할 것인지
		StringTokenizer findToken = new StringTokenizer(bf.readLine());

		for (int i = 0; i < m; i++) {
			// 이분 탐색으로 값 찾기
			if (find(arr, Integer.parseInt(findToken.nextToken())))
				System.out.println(1);
			else
				System.out.println(0);
		}
	}

	public static boolean find(int[] arr, int num) {

		int low = 0; // 왼쪽 끝 인덱스
		int high = arr.length - 1; // 오른쪽 끝 인덱스

		while (low <= high) {
			int mid = (low + high) / 2; // 중간 위치

			if (arr[mid] > num) { // 숫자가 왼쪽에 있다면
				high = mid - 1; // 오른쪽 끝 인덱스를 중간 위치 - 1로 맞춘다
			} else if (arr[mid] < num) { // 숫자가 오른쪽에 있다면
				low = mid + 1; // 왼쪽 끝 인덱스를 중간 위치 + 1로 맞춘다
			} else { // arr[mid] == num
				return true;
			}
		}

		return false;
	}
}
