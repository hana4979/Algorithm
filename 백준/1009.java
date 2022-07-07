import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testcase =  Integer.parseInt(bf.readLine());
		
		for(int i = 0; i < testcase; i++) {
			String dataInput = bf.readLine();
			StringTokenizer token = new StringTokenizer(dataInput, " ");
			
			int data = Integer.parseInt(token.nextToken());
			int pow = Integer.parseInt(token.nextToken());
			
			// 1부터 10까지 (전체적으로 봤을 때) 4번씩 같은 숫자 패턴이 나옴
			if(pow < 5) {
				System.out.println(Math.round(Math.pow(data, pow) % 10));
			} else {
				System.out.println(Math.round(Math.pow(data, pow % 4) % 10));
			}
			
			// Math.round() : 값이 가장 가까운 정수로 반올림하는 메소드
		}

	}
}