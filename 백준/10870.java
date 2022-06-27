import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		System.out.println(fibonacci(n));
		
	}
	
	public static int fibonacci(int n) {
		if(n <= 1)
			return n;
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}
}