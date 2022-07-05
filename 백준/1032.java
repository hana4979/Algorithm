import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int repeat = Integer.parseInt(bf.readLine());
		String file = " ";
		char[] fileName = new char[29]; // 알파벳 28 + 부호 .
		
		for(int i = 0; i < repeat; i++) {
			
			file = bf.readLine();
			
			/* ==> 첫번째 string 저장하고 true or false 로 비교출력 해보기
			for(int j = 0; j < file.length(); j++){
				if(String.valueOf(file.charAt(j)).equals(".")) { // 문자 . 이 온다면
					fileName[28]++; // 알파벳을 제외한 임의의 자리 28번째 인덱스에 저장
				} else {
					fileName[file.charAt(j) - 97]++; // 한 글자씩 저장
				}
			}
			*/
		}
		
		// 비교 + 점 . 나왔을 경우 추가
		for(int i = 0; i < file.length(); i++) {
			if(fileName[file.charAt(i) - 97] == repeat) {
				System.out.print(file.charAt(i));
			} else {
				System.out.print("?");
			}
		}
		
	}
}

// . 의 경우 아스키코드 46인데.. 예외로 if처리를 해주자