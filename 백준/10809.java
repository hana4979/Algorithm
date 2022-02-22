import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		
		String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
							"n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		
		int[] firstArr = new int[26]; // 알파벳 26개
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String word = bf.readLine(); // 단어 입력 받기
		
		// *** toCharArr() 이용해서 문자열을 한 글자시 char형으로 바꿀 수도 있음
		String[] wordArr = word.split(""); // 공백없이 한 글자씩 자르기
		
		// firstArr값을 모두 -1로 설정
		for(int i = 0; i < firstArr.length; i++)
			firstArr[i] = -1;
		
		for(int i = 0; i < wordArr.length; i++) {
			for(int j = 0; j < alphabet.length; j++) {
				if(alphabet[j].equals(wordArr[i])) { // 토큰 값이 해당 알파벳이고
					if(firstArr[j] == -1) { // 이전에 나온 알파벳이 아니라면
						firstArr[j] = i;
						break; // 입력을 완료했다면 빠져나가기
					}
				}
			}
		}

		for(int i = 0; i < firstArr.length; i++)
			System.out.print(firstArr[i] + " ");
	}
}
