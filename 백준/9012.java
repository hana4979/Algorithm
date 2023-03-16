import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static char[] psArr;
	public static int size = 0;
	
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(bf.readLine());
		
		for(int i = 0; i < T; i++) {
			String ps = bf.readLine();
			
			psArr = new char[50];
			
			// 배열에 괄호 넣기
			for(int j = 0; j < ps.length(); j++) {
				// (( == 40, )) == 41
				psArr[size++] = ps.charAt(j);
			}
			
			sb.append(vpsCheck());
		}
		
	}
	
	/*
	public static String vpsCheck() {
		// 맨 앞과 맨 뒤는 각각 '(', ')' 고정되어야 함
		if(psArr[0] != '(' || psArr[size - 1] != ')')
			return "NO";
	}
	*/
	
}