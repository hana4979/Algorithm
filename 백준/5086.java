import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer numToken = new StringTokenizer(bf.readLine());
			
			int first = Integer.parseInt(numToken.nextToken());
			int second = Integer.parseInt(numToken.nextToken());
			
			if(first == 0 && second == 0) // 0 0 이 입력되면
				break;
			
			if((second >= first) && (second % first == 0)) // 첫번째 숫자가 약수라면
				System.out.println("factor");
			else if((first >= second) && (first % second == 0)) // 첫번째 숫자가 배수라면
				System.out.println("mutiple");
			else
				System.out.println("neither"); // 약수도, 배수도 아니라면
		}
		
	}
}
