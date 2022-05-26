import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer seven25 = new StringTokenizer(bf.readLine(), " "); // 세븐25 삼각김밥 정보
		
		// 세븐 25 삼각김밥 그램당 가격
		double min = Double.parseDouble(seven25.nextToken()) / Double.parseDouble(seven25.nextToken());
		
		int n = Integer.parseInt(bf.readLine());
		
		for(int i = 0; i < n; i++) {
			StringTokenizer token = new StringTokenizer(bf.readLine(), " ");
			double value = Double.parseDouble(token.nextToken()) / Double.parseDouble(token.nextToken());
			if(min > value)
				min = value;
		}
		
		System.out.println(String.format("%.2f", min * 1000.00));
	}
}
