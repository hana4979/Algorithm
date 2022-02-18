import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String str = bf.readLine();
		
		StringTokenizer st = new StringTokenizer(str, " "); // 디폴트 공백 구분
		
		int count = 0; // 공백 단위 단어 카운트할 변수
		
		while(st.hasMoreTokens()) { // 불러올 토큰이 있을 경우
			st.nextToken(); // 다음 토큰을 불러오고
			count += 1; // count + 1
		}
		
		System.out.println(count);
		
		// st.countTokens() : 현재 남아있는 토큰 갯수 반환 (이런 메소드도 있대)
		// System.out.println(st.countTokens());
	}
}