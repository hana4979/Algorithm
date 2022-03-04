import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		// string 한 글자씩 받아 char형(숫자)으로 변환
		char[] changeAlphabet = bf.readLine().toCharArray();
		
		for(int i = 0; i < changeAlphabet.length; i++) {
			int n = changeAlphabet[i];
			
			// + 각 알파벳을 다이얼에 맞는 숫자로 변환하고 글자크기(길이)만큼 더해도 됨 +
			// ex) WA -> 11(다이얼) + 2(글자길이)
			
			// ++ 변환과 더하기 한 번에 진행해도 됨 ++
			
			
			// 입력 숫자 + 1(초 추가로 걸림) = 총 걸리는 시간
			if(n >= 65 && n <= 67)
				changeAlphabet[i] = 3;
			else if(n >= 68 && n <= 70)
				changeAlphabet[i] = 4;
			else if(n >= 71 && n <= 73)
				changeAlphabet[i] = 5;
			else if(n >= 74 && n <= 76)
				changeAlphabet[i] = 6;
			else if(n >= 77 && n <= 79)
				changeAlphabet[i] = 7;
			else if(n >= 80 && n <= 83)
				changeAlphabet[i] = 8;
			else if(n >= 84 && n <= 86)
				changeAlphabet[i] = 9;
			else if(n >= 87 && n <= 90)
				changeAlphabet[i] = 10;
		}
		
		int sum = 0;
		
		for(int i = 0; i < changeAlphabet.length; i++) {
			sum += changeAlphabet[i];
		}
		
		System.out.println(sum);
		
	}
}