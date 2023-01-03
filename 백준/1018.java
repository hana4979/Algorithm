import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
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
				if (chess.charAt(i) == 'W')
					chessboard[i][j] = true;
				else if (chess.charAt(i) == 'B')
					chessboard[i][j] = false;
			}
		}

		// 참고 : https://st-lab.tistory.com/101
		// 8 * 8 의 경우 (행 - 7) * (열 - 7) * 2(첫 시작이 W or B)의 경우의 수를 갖는다

	}

	public static int mapping(boolean[][] chessboard, char first, int count) {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (chessboard[i][j]) // 'W'일 경우
					count++;
				else // 'B'일 경우
					count--;
			}
		}

		return count;
	}
}