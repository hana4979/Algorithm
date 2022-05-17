import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int[] wordArr1 = new int[26];
		int[] wordArr2 = new int[26];
		int removeCount = 0; // 제거해야 할 최소 갯수 문자
		
		/*
		for (int i = 0; i < 2; i++) {
			String word = bf.readLine();
			for (int j = 0; j < word.length(); j++) {
				int alphabet = word.charAt(j) - 97; // 아스키 코드 97 == a
				// 매번 확인해야하는 불편함 존재
				if (i == 0)
					wordArr1[alphabet]++;
				else
					wordArr2[alphabet]++;
			}
		}
		*/
		
		// 짧게 줄인 코드
		String word1 = bf.readLine();
		for(int i = 0; i < word1.length(); i++)
			wordArr1[word1.charAt(i) - 97]++;

		String word2 = bf.readLine();
		for(int i = 0; i < word2.length(); i++)
			wordArr2[word2.charAt(i) - 97]++;
		
		for (int i = 0; i < wordArr1.length; i++) {
			if (wordArr1[i] != wordArr2[i]) {
				removeCount += Math.abs(wordArr1[i] - wordArr2[i]);
			}
		}

		System.out.println(removeCount);

	}
}

// 배열 하나만 사용하는 방법도 존재 (++ / -- 로 값 조정 후 절대값 추출)