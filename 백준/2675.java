import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int testcase = Integer.parseInt(bf.readLine());
		
		for(int i = 0; i < testcase; i++) {
			
			String inputString = bf.readLine();
			
			StringTokenizer st = new StringTokenizer(inputString);
			int r = Integer.parseInt(st.nextToken()); // 반복횟수
			char[] sArr = st.nextToken().toCharArray(); // 문자열을 char형 배열로 바꿈
			
			for(int j = 0; j < sArr.length; j++) { // 문자열 길이만큼 반복
				for(int k = 0; k < r; k++) // 각 문자열을 반복횟수만큼 반복
					System.out.print(sArr[j]);
			}
			
			System.out.println();
		}
		
	}
}