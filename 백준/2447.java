import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static char[][] starArr;
	static int bigCount; // N = 9 의

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bf.readLine()); // 3의 거듭제곱 N

		starArr = new char[N][N];

		star(0, 0, N, false);

		for (int row = 0; row < N; row++) {
			for (int col = 0; col < N; col++) {
				System.out.print(starArr[row][col]);
			}
			System.out.println();
		}
	}

	public static void star(int row, int col, int N, boolean blank) {

		if (N == 1) {
			starArr[row][col] = '*';
			return;
		}

		/*
		 * N = 3 의 형태를 기본 형태로 잡음
		 */
		int smallCount = 0; // 5번째는 공백
		for (int i = row; i < row + 3; i++) {
			for (int j = col; j < col + 3; j++) {
				smallCount++;

				if (blank) { // blank == true
					starArr[i][j] = ' ';
				} else if (smallCount == 5) // 5번째 오는 모양 == 1*1로 가운데 뚫려야하는 부분
					starArr[i][j] = ' ';
				else {
					starArr[i][j] = '*';
				}
			}
		}
		
		/*
		 * N > 3의 경우, N = 9 의 형태를 연달아 잇고 가운데를 (N/3) * (N/3) 크기로 뚫은 것
		 */
		
		// 
		int size = N / 3;
		for (int i = row; i < size; i++) {
			for (int j = col; j < size; j++) {
				bigCount++;
				
				/*
				 * N = 9의 경우 기본 형태가 ... 고민중.
				 */
				if (bigCount == N)
					return;
				else if (bigCount == 5)
					star(i + 3, j + 3, N, true);
				else
					star(i + 3, j + 3, N, false);
			}
		}
	}
}

/*
 * 1. N = 3 일때를 기본 형태로 잡고 N > 3 일때는 9 * 9 의 패턴이 있다! 까지는 알아냈으나 이를 배열에 저장할 생각은 못 함
 */
