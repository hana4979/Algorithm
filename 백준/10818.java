import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		String str = bf.readLine();
		
		int[] numArr = new int[n];
		
		StringTokenizer st = new StringTokenizer(str, " ");
		
		for(int i = 0; i < n; i++) {
			numArr[i] = Integer.parseInt(st.nextToken()); // 정수값으로 변환한 토큰들 배열에 넣어주기
		}
		
		int max = numArr[0];
		int min = numArr[0];
		
		for(int i = 1; i < n; i++) {
			if(max < numArr[i])
				max = numArr[i];
			
			if(min > numArr[i])
				min = numArr[i];
		}
		
		System.out.print(min);
		System.out.println(" " + max);
		
	}
}
