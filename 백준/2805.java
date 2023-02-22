import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer token = new StringTokenizer(bf.readLine());

		int n = Integer.parseInt(token.nextToken()); // 나무의 수
		int m = Integer.parseInt(token.nextToken()); // 가져가려고 하는 나무의 길이

		int[] tree = new int[n];
		StringTokenizer treeToken = new StringTokenizer(bf.readLine());

		int min = 0;
		int max = 0;

		for (int i = 0; i < n; i++) {
			int treeLength = Integer.parseInt(treeToken.nextToken());
			tree[i] = treeLength;

			if (max < treeLength)
				max = treeLength;
		}
		
		int mid = 0;

		while (min < max) {
			// Overflow 대비
			mid = (max - min) / 2 + min;

			// 나무 길이 최대가 10억이라 overflow 발생 가능성 있음
			long count = 0;

			for (int i = 0; i < n; i++) {
				int check = tree[i] - mid;
				
				// tree[i] - mid 값이 음수가 나온다면
				if(check < 0)
					check = 0;
				
				count += check;
			}
			
			if (count < m)
				max = mid;
			else
				min = mid + 1;
			
			/*
			 * count == m 의 경우
			 * 높이의 최댓값을 구해야 하기 때문에 min을 증가해야 함
			 */

		}

		System.out.println(min - 1);

	}
}
