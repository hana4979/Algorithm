import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String str = bf.readLine(); // 단어 입력 받기
		str = str.toUpperCase(); // 모두 대문자로 변환
		
		int[] alphabetArr = new int[26]; // 알파벳 26개
		char[] charArr = str.toCharArray(); // char형으로, 하나씩 배열에 저장
		
		for(int i = 0; i < charArr.length; i++) {
			for(int j = 0; j < alphabetArr.length; j++) {
				if((charArr[i] - 65) == j) { // char형 대문자 A - 65 = 0
					alphabetArr[j] += 1; // 빈도수 1 증가
					break;
				}
			}
		}

		int max = alphabetArr[0]; // 초기 max값 설정 A 빈도수
		char alphabet = 65; // 초기 알파벳 설정 A
		int second = 0;
		
		for(int i = 1; i < alphabetArr.length; i++) {
			if(alphabetArr[i] >= max) {
				second = max;
				max = alphabetArr[i];
				alphabet = (char)(i + 65); // 대문자로 저장(후에 변환)
			}
		}
		
		if(max == second)
			System.out.println("?");
		else
			System.out.println(alphabet);
		
	}
}