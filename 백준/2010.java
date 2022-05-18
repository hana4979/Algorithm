import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		int connectComputer = 0;
		
		for(int i = 0; i < n; i++) {
			connectComputer += Integer.parseInt(bf.readLine());
		}
		
		System.out.println(connectComputer - n + 1); // - (n-1)

	}
}