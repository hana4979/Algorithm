import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		int count = 0;

		for (int i = 0; i < n; i++) {
			String str = bf.readLine();
			char[] word = str.toCharArray(); // char형으로 변환
			char[] alphabet = new char[26];

			if (check(word, alphabet))
				count++;

		}
		System.out.println(count);

	}

	public static boolean check(char[] word, char[] alphabet) {
		for (int j = 0; j < word.length; j++) {
			if (j == 0 || alphabet[word[j]-'a'] == 0)
				alphabet[word[j]-'a']++;
			else if (word[j - 1] != word[j])
				return false;
		}
		return true;
	}
}

// word[j-1] == word[j] 의 경우 굳이 빈도를 늘릴 필요 없음
// for문이 끝나면 자연스럽게 count++; 해주는 식으로 바꿈
