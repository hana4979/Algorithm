import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine()); // 반복횟수

		for (int i = 0; i < n; i++) {
			StringTokenizer token = new StringTokenizer(bf.readLine());
			int row = Integer.parseInt(token.nextToken()); // 행
			int col = Integer.parseInt(token.nextToken()); // 열
			char[][] matrix = new char[row][col];

			String secretMessage = token.nextToken();

			// 배열에 문자 저장
			for (int r = 0; r < row; r++) {
				for (int c = 0; c < col; c++) {
					matrix[r][c] = secretMessage.charAt(r + c);
				}
			}

			// 문자 읽어 들이기
			for (int j = 0; j < row + col; j++) {
				int matrixRow = 0; // 행
				int matrixCol = 0; // 열
				Character interpretMessage;
				/*
				 * https://stackoverflow.com/questions/18781564/cannot-invoke-equalschar-on-the-
				 * primitive-type-char
				 */
				// 행 0, 열 0 --> 열 ++
				// 행 0, 열 n --> 행 ++
				// 행 n, 열 n --> 열 --
				// 행 n, 열 0 --> 행 --
				// 행 1, 열 0 --> 열 ++
				// 행 1, 열 n-1 --> 행 ++
				// 열 증가 , 헹 증가, 열 0까지 감소, 행 0까지 감소...

				/*
				 * 이거 아닌데... for(matrixRow = 0; matrixRow < row; matrixRow++) { for(matrixCol =
				 * 0; matrixCol < col; matrixCol++) {
				 * interpretMessage.append(matrix[matrixRow][matrixCol]); } }
				 */
			}

		}

	}
}

/*
 * 1. 행, 렬 크기 입력 받기
 * 2. 행렬 크기에 따라 순차적으로 메시지(숫자) 입력
 * 3. (열 증가, 행 증가, 열 감소, 행 감소) 반복 루트로 값 읽어들이기
 * 4. 5자리로 끊어서 2진수를 알파벳으로 변환
 * 5. if) 공백으로 끝난다면(00000) 제거 후 출력
 */