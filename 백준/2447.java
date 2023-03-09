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

		// 하나하나 print 할 경우 시간초과 문제 발생
		StringBuilder sb = new StringBuilder();
		for (int row = 0; row < N; row++) {
			for (int col = 0; col < N; col++) {
				sb.append(starArr[row][col]);
			}
			sb.append('\n');
		}

		System.out.print(sb);
	}

	public static void star(int row, int col, int N, boolean blank) {

		if (blank) { // 공백칸일 때
			for (int i = row; i < row + N; i++) {
				for (int j = col; j < col + N; j++) {
					starArr[i][j] = ' ';
				}
			}

			return;
		}

		if (N == 1) {
			starArr[row][col] = '*';
			return;
		}

		/*
		 * N = 9일 경우 N = 3일 때의 모양이 한 불럭이 되어 되풀이, 사이즈 3
		 * N = 27일 경우 N = 9일 때의 모양이 한 블럭이 되어 되풀이, 사이즈 9
		 */

		int size = N / 3; // 한 블록의 사이즈
		int count = 0; // 별 출력 누적 합을 의미

		/*
		 * ***
		 * * *
		 * *** 를 한 덩어리로 보고 반복하면
		 * 
		 * (0,0)(0,3)(0,6)
		 * (3,0)(3,3)(3,6)
		 * (6,0)(6,3)(6,6)
		 * 
		 * 그 다음 덩어리의 좌표는 위처럼 정해짐
		 */

		for (int i = row; i < row + N; i += size) {
			for (int j = col; j < col + N; j += size) {
				count++;

				if (count == 5)
					star(i, j, size, true);
				else
					star(i, j, size, false);
			}
		}
	}
}

/*
 * 생각하지 못했던 포인트
 * 1. 이차원 배열을 선언해 하나하나 지정해주기
 * 2. N / 3의 사이즈 값을 정한 후 값을 넘겨주어 가장 작은 단위가 될 때까지 재귀호출
 * 
 * + 나한텐 너무 어려웠던 문제...
 * 알고리즘 참고 : https://st-lab.tistory.com/95
 */
