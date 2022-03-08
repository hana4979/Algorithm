import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		// dz는 무조건 하나의 알파벳 --> if 에서 우선이 되어야 함
		
		char[] croatiaArr = bf.readLine().toCharArray();
		int wordLength = 0; // 글자수
		int i = 0;
		
		// equals() Object 클래스에 포함되어 Java에서 생성된 모든 클래스에 상속을 통해 전달되는 메소드입니다.
		// 그리고 메소드이기 때문에 프리미티브가 아닌 객체에 의해서만 호출될 수 있습니다.
		// StringTokenizer로 뽑은 건 되던데 뭐지 --> 알아보기
		
		try {
			for(i = 0; i < croatiaArr.length; i++) {
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
		} catch (Exception ArrayIndexOutOfBoundsException) {
			if(i - 2 < 0) // i가 try문에서 이어지는 게 맞을까? --> 아닌듯.
				wordLength += 2;
			else
				wordLength += 1;
		}
		
		
		System.out.println(wordLength);
	}
}

// 220307 런타임에러(croatiaArr[i+1] --> ArrayIndexOutOfBoundsException)
// 220308 catch문 문제있음
