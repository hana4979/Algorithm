import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer sizeToken = new StringTokenizer(bf.readLine());

		int n = Integer.parseInt(sizeToken.nextToken());
		int m = Integer.parseInt(sizeToken.nextToken());

		int[][] matrix_a = new int[n][m];
		int[][] matrix_b = new int[n][m];

		for (int i = 0; i < n; i++) {
			StringTokenizer numToken = new StringTokenizer(bf.readLine());
			for (int j = 0; j < m; j++)
				matrix_a[i][j] = Integer.parseInt(numToken.nextToken());
		}

		for (int i = 0; i < n; i++) {
			StringTokenizer numToken = new StringTokenizer(bf.readLine());
			for (int j = 0; j < m; j++)
				matrix_b[i][j] = Integer.parseInt(numToken.nextToken());
		}

		// 행렬 덧셈 : (같은 행, 같은 열)끼리 더함
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(matrix_a[i][j] + matrix_b[i][j] + " ");
			}
			System.out.println();
		}
	}
}
