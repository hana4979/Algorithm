import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		
		String[] alphabet = {"a", "b", "c", "d", "h", "i", "j", "k", "l", "m", "n",
							 "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		
		int[] firstArr = new int[26]; // 알파벳 26개
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String word = bf.readLine(); // 단어 입력 받기
		
		// **error** StringTokenizer로 공백없이 받는 법 찾기
		StringTokenizer st = new StringTokenizer(word, "");
		
		// firstArr값을 모두 -1로 설정
		for(int i = 0; i < firstArr.length; i++)
			firstArr[i] = -1;
		
		String token; // 토큰을 임시저장할 변수
		int count = 0;
		
		do {
			token = st.nextToken();
			
			System.out.println(token);
			
			for(int i = 0; i < alphabet.length; i++) {
				if(alphabet[i].equals(token)) { // 토큰 값이 해당 알파벳이고
					if(firstArr[i] == -1) { // 이전에 나온 알파벳이 아니라면
						firstArr[i] = count;
						count++;
					}
				}
			}
		} while(st.hasMoreTokens()); // 토큰이 존재할 때까지 계속 돌림
		
		for(int i = 0; i < firstArr.length; i++)
			System.out.print(firstArr[i] + " ");
	}
}
