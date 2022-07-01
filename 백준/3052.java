import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		HashSet<Integer> numSet = new HashSet<Integer>(); // HashSet : 중복값을 저장하지 않음

		for(int i = 0; i < 10; i++) {
			int num = Integer.parseInt(bf.readLine());
			numSet.add(num % 42);
		}
		
		System.out.println(numSet.size());
		
	}
}