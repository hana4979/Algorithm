import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		char[][] wordArr = new char[5][15];

		for (int i = 0; i < 5; i++) {
			String str = bf.readLine();
			for (int j = 0; j < str.length(); j++) {
				wordArr[i][j] = str.charAt(j);
			}
		}

		for (int i = 0; i < wordArr[0].length; i++) {
			for (int j = 0; j < wordArr.length; j++) {
				if (wordArr[j][i] != 0) // char형에서 빈칸 체크는 0
					System.out.print(wordArr[j][i]);
			}
		}
	}
}
