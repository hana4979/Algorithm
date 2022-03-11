import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		for(int i = n; i > 0; i--) {
			for(int j = i - 1; j > 0; j--)
				System.out.print(" ");
			
			for(int h = n - i + 1; h > 0; h--)
				System.out.print("*");
			System.out.println();
		}
		
		
	}
}
