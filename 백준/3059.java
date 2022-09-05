import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());

		for (int i = 0; i < n; i++) {

			boolean[] alphabet = new boolean[26];
			String str = bf.readLine();
			char result = ' ';

			for (int j = 0; j < str.length(); j++) {
				alphabet[str.charAt(j) - 65] = true; // 문자에 'a'값을 뺀 배열의 인덱스 값을 true로 설정
			}

			for (int j = 0; j < alphabet.length; j++) {
				if (!alphabet[j] == true) {
					result += (char) j + 'a';
				}
			}

			// 값이 ? 로 나오는 오류
			System.out.println(result);
		}

	}
}
