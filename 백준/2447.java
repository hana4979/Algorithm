import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static char[][] starArr;

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

		// N = 3 인 경우까지만 구현
		int count = 0; // 5번째는 공백
		for (int i = row; i < row + 3; i++) {
			for (int j = col; j < col + 3; j++) {
				count++; 
				
				if (count == 5)
					starArr[i][j] = ' ';
				else {
					starArr[i][j] = '*';
				}
			}
		}

		int size = N / 3;
	}
}

/*
 * 1. N = 3 일때를 기본 형태로 잡고 N > 3 일때는 9 * 9 의 패턴이 있다! 까지는 알아냈으나 이를 배열에 저장할 생각은 못 함
 */

/*
 * N = 3, 기본 형태를 아래와 같이 했을 떼
 * ***
 * * *
 * ***
 * 
 * N = 9, 기본 형태를 나열했을 때 
 * 1. 기본 형태 나열 기준, 가운데 ((N/3)3) * ((N/3)/3) 비우기
 * 2. 기본 형태 집합체 기준, 가운데 (N/3) * (N/3) 크기로 비우기
 */