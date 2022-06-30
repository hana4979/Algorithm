import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[][] chessboard = new String[8][8]; // 8 * 8 체스판
		
		for(int i = 0; i < 8; i++) {
			String chessboardInput = bf.readLine(); // 한 줄씩 입력받기
			
			String[] arr = chessboardInput.split(""); // 한 글자씩 저장
			
			for(int j = 0; j < 8; j++) {
				chessboard[i][j] = arr[j];
			}
		}
		
		int horseCount = 0;
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 4; j++) {
				if(i % 2 == 0) {
					if(chessboard[i][j * 2].equals("F")) {
						horseCount++;
					}
				} else { // i % 2 != 0
					if(chessboard[i][j * 2 + 1].equals("F")) {
						horseCount++;
					}
				}
			}
		}
		
		System.out.println(horseCount);
	}
}