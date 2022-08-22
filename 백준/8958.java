import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());

		for (int i = 0; i < n; i++) {
			String quiz = bf.readLine();
			int countO = 0;
			int result = 0;

			// quiz 문자열 길이만큼 반복
			for (int j = 0; j < quiz.length(); j++) {
				if (quiz.charAt(j) == 'O') {
					countO++;
					result += countO;

				} else { // 'X'
					countO = 0; // 문제 틀렸을 시 0점으로 초기화
				}
			}

			System.out.println(result);
		}

	}
}
