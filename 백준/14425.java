import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer token = new StringTokenizer(bf.readLine());
		
		int n = Integer.parseInt(token.nextToken());
		HashSet<String> strSet = new HashSet<>();
		
		for(int i = 0; i < n; i++) {
			strSet.add(bf.readLine());
		}
		
		int m = Integer.parseInt(token.nextToken());
		
		int count = 0;
		
		for(int i = 0; i < m; i++) {
			if(strSet.contains(bf.readLine())) {
				count++;
			};
		}
		
		System.out.println(count);
	}
}