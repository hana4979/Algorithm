import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int[] wordArr1 = new int[26];
		int[] wordArr2 = new int[26];
		int removeCount = 0; // 제거해야 할 최소 갯수 문자
		
		String word = bf.readLine();
		//StringTokenizer token = new StringTokenizer(word, ""); 굳이 X
		for(int i = 0; i < word.length(); i++ ) {
			int alphabet = word.charAt(i) - 97; // 아스키 코드 97 == a
			for (int j = 0; j < 26; j++) {
				if (j == alphabet) {
					wordArr1[j]++;
				}
			}
			
		}
		
		// 비교
		
		// 출력
		
	}
}
// 220516 같은 코드 이용하여 wordArr2 에도 값 넣기 + 비교 + 출력