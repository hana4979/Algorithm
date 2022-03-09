import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		// dz는 무조건 하나의 알파벳 --> if 에서 우선이 되어야 함
		
		char[] wordArr = bf.readLine().toCharArray();
		char[] croatiaArr = new char[wordArr.length + 2]; // if문 ArrayIndexOutOfBoundsException 방지할 +2만큼 긴 배열
		
		for(int i = 0; i < wordArr.length; i++) {
			croatiaArr[i] = wordArr[i]; // 배열 복사
		}
		
		int wordLength = 0; // 글자수
		
		// equals() Object 클래스에 포함되어 Java에서 생성된 모든 클래스에 상속을 통해 전달되는 메소드입니다.
		// 그리고 메소드이기 때문에 프리미티브가 아닌 객체에 의해서만 호출될 수 있습니다.
		// StringTokenizer로 뽑은 건 되던데 뭐지 --> 알아보기
		
			for(int i = 0; i < croatiaArr.length-2; i++) {
				if(croatiaArr[i] == 'd'){ // d
					if(croatiaArr[i+1] == 'z' && croatiaArr[i+2] == '=')
						i += 2;
					else if(croatiaArr[i+1] == '-')
						i += 1;
					wordLength++;
						
				} else if(croatiaArr[i] == 'c') { // c
					if(croatiaArr[i+1] == '=' || croatiaArr[i+1] == '-')
						i += 1;
					wordLength++;
					
				} else if(croatiaArr[i] == 'l') { // l
					if(croatiaArr[i+1] == 'j')
						i += 1;
					wordLength++;
					
				}else if(croatiaArr[i] == 'n') { // n
					if(croatiaArr[i+1] == 'j' )
						i += 1;
					wordLength++;
					
				} else if(croatiaArr[i] == 's') { // s
					if(croatiaArr[i+1] == '=')
						i += 1;
					wordLength++;
					
				} else if(croatiaArr[i] == 'z') { // z
					if(croatiaArr[i+1] == '=')
						i += 1;
					wordLength++;
					
				} else {
					wordLength++;
				}
			}
		
		
		System.out.println(wordLength);
	}
}

// 220307 런타임에러(croatiaArr[i+1] --> ArrayIndexOutOfBoundsException)
// 220308 catch문 문제있음
// 220309 배열 길이를 if문에 맞도록 +2만큼 늘려서 풀이