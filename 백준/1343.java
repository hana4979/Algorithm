import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	static boolean findError = false;

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String board = bf.readLine();
		int countX = 0;
		StringBuffer polyomino = new StringBuffer("");

		for (int i = 0; i < board.length(); i++) {
			if (board.charAt(i) == 'X') {
				countX++;
			} else { // board.charAt(i) == '.'
				polyominoStringAppend(countX, polyomino);
				countX = 0;
				if (findError)
					break;
			}
		}

		polyominoStringAppend(countX, polyomino);
		if (!findError)
			polyomino.deleteCharAt(polyomino.lastIndexOf(".")); // 마지막 '.' 문자 지우기
		System.out.println(polyomino);

	}

	public static void polyominoStringAppend(int countX, StringBuffer polyomino) {
		// board.charAt(i) == '.'
		int countA = countX / 4;
		int countB = (countX % 4) / 2;

		if ((countX % 4) % 2 != 0) {
			polyomino.delete(0, polyomino.length());
			polyomino.append("-1");
			findError = true;
		}

		if (!findError) {
			// 4로 나눠지는 만큼 "AAAA" 추가
			for (int a = 0; a < countA; a++)
				polyomino.append("AAAA");

			// % 4 / 2 만큼 "BB" 추가
			for (int b = 0; b < countB; b++)
				polyomino.append("BB");

			polyomino.append(".");
		}
	}
}