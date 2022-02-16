import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine()); // 몇 개의 숫자를 받을 것인지
		
		String number = bf.readLine();
		String[] numArr = number.split(""); // 글 하나씩 잘라 넣기
		
		int value = 0;
		
		for(int i = 0; i < n; i++) {
			value += Integer.parseInt(numArr[i]);
		}
		
		System.out.print(value);
	}
}