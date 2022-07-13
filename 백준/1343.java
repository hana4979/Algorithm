import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String board = bf.readLine();
		int[] boardCheck = new int[board.length()]; // 최대 크기 50 보드판
		int index = 1;

		for (int i = 0; i < board.length(); i++) {
			if (board.charAt(i) == '.') {
				index++;
			} else {
				boardCheck[index]++;
			}
		}
		
		String polyomino = "";
		
		for(int i = 0; i < boardCheck.length; i++) {
			int polyominoCheck = boardCheck[i];
			
			int countA = polyominoCheck / 4;
			int countB = (polyominoCheck % 4) / 2;
		}

		// 갈엎을 반복하며.. 암튼 하는 중
	}
}