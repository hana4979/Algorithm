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
		char[][] chessboard = new char[row][cul];

		// 체스판에 값 저장
		for (int i = 0; i < row; i++) {
			String chess = bf.readLine();
			for (int j = 0; j < cul; j++) {
				chessboard[i][j] = chess.charAt(j);
			}
		}

		// 'B'이면 +1, 'W'이면 -1로 칠해야 할 정사각형 수 확인
		int count = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cul; j++) {
				if (chessboard[i][j] == 'B')
					count++;
				else // chessboard[i][j] == 'W'
					count--;
			}
		}

		System.out.print(count / 2); // 하나는 'W'로 바뀌어야 함
	}
}

//230102 : 8 X 8로 뽑아냈을 때 가장 적게 칠하는 경우를 어떻게 확인할지 고민