import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		// dz는 무조건 하나의 알파벳 --> if 에서 우선이 되어야 함
		
		char[] croatiaArr = bf.readLine().toCharArray();
		int wordLength = 0; // 글자수
		
		for(int i = 0; i < croatiaArr.length; i++) {
			if(croatiaArr[i] == 'd'){ // d
				if(croatiaArr[i+1] == 'z' && croatiaArr[i+2] == '=') {
					i += 2;
					wordLength++;
				} else if(croatiaArr[i+1] == '-') {
					i += 1;
					wordLength++;
				} else {
					wordLength++;
				}
				
			} else if(croatiaArr[i] == 'c') { // c
				if(croatiaArr[i+1] == '=' || croatiaArr[i+1] == '-') {
					i += 1;
					wordLength++;
				} else {
					wordLength++;
				}
				
			} else if(croatiaArr[i] == 'l') { // l
				if(croatiaArr[i+1] == 'j') {
					i += 1;
					wordLength++;
				} else {
					wordLength++;
				}
				
			}else if(croatiaArr[i] == 'n') { // n
				if(croatiaArr[i+1] == 'j' ) {
					i += 1;
					wordLength++;
				} else {
					wordLength++;
				}
				
			} else if(croatiaArr[i] == 's') { // s
				if(croatiaArr[i+1] == '=') {
					i += 1;
					wordLength++;
				} else {
					wordLength++;
				}
				
			} else if(croatiaArr[i] == 'z') { // z
				if(croatiaArr[i+1] == '=') {
					i += 1;
					wordLength++;
				} else {
					wordLength++;
				}
				
			} else {
				wordLength++;
			}
		}
		
		System.out.println(wordLength);
	}
}

// 220307 런타임 에러