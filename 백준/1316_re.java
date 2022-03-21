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

			for (int j = 0; j < word.length; j++) {
				if (j == 0 || alphabet[j] == 0)
					alphabet[j]++;
				else if (word[j - 1] != word[j])
					break;
				else {
					// j == word.length : true일 시 count++ 추가하기
				}
			}

		}

		System.out.println(count);

	}

}

// word[j-1] == word[j] 의 경우 굳이 빈도를 늘릴 필요 없음
// 220321 뭔가 메소드를 이용해서 보기 좋은 코드를 만들 수 있을 것 같음
