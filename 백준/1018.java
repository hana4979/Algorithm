import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int min = 64; // 8 * 8 크기

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer token = new StringTokenizer(bf.readLine(), " ");
		int row = Integer.parseInt(token.nextToken());
		int cul = Integer.parseInt(token.nextToken());
		// 첫 시작이 'W' or 'B' 인 경우의 수 2가지가 존재하기 때문에 추후 확인 시 불필요한 오류를 방지하기 위해 boolean으로 받음
		boolean[][] chessboard = new boolean[row][cul];

		// 체스판에 값 저장
		for (int i = 0; i < row; i++) {
			String chess = bf.readLine();
			for (int j = 0; j < cul; j++) {
				if (chess.charAt(j) == 'W')
					chessboard[i][j] = true;
				else // chess.charAt(j) == 'B'
					chessboard[i][j] = false;
			}
		}

		// 참고 : https://st-lab.tistory.com/101
		// 8 * 8 의 경우 (행 - 7) * (열 - 7) * 2(첫 시작이 W or B)의 경우의 수를 갖는다
		int end_r = row - 7;
		int end_c = cul - 7;
		for (int i = 0; i < end_r; i++) {
			for (int j = 0; j < end_c; j++) {
				mapping(chessboard, i, j);
			}
		}

		System.out.print(min);
	}

	// row 와 cul 입력 받고 그 값으로 시작하는 배열의 8 * 8 경우의 수 확인
	public static void mapping(boolean[][] chessboard, int add_i, int add_j) {
		int count = 0;
		boolean TF = chessboard[add_i][add_j]; // 첫 번째 칸의 색

		for (int i = add_i; i < 8 + add_i; i++) {
			for (int j = add_j; j < 8 + add_j; j++) {
				if (chessboard[i][j] != TF) // 올바른 색이 아닐 경우
					count++;

				TF = !(TF); // 다음 칸은 색이 바뀌어야 함
			}

			TF = !(TF); // 다음 줄 첫 번째는 그 전 줄의 마지막 색이어야 함
		}

		// 시작이 'W'이냐 'B'이냐에 따라 경우의 수 2가지가 나옴
		// 그 둘 중 더 작은 값을 저장
		// 8 * 8 - count
		count = Math.min(count, 64 - count);

		// 현재 count값이 더 작다면 최솟값 갱신
		min = Math.min(min, count);
	}
}