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

			int count = 0;

			for (int i = 0; i < n; i++) {
				count += tree[i] - mid;
			}

			/*
			 * 다시 짜야 함
			 * if(count < m)
			 * 	max = mid;
			 * else
			 * 	min = mid + 1;
			 */

			/*
			 * System.out.println("max : " + max);
			 * System.out.println("min : " + min);
			 */

		}

		System.out.println(mid);

	}
}
