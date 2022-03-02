import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		
		int[] n1Arr = new int[3];
		int[] n2Arr = new int[3];
		
		// 역순으로 재배치
		for(int i = 3; i > 3; i--) {
			n1Arr[i] = n1 % 10;
			n2Arr[i] = n2 % 10;
			n1 /= 10;
			n2 /= 10;
		}
		
		for(int i = 0; i<3; i++)
			System.out.println(n1Arr[i]);
		
		// 숫자 비교
		for(int i = 0; i < 3; i++) {
			if(n1Arr[i] > n2Arr[i]) {
				for(int j = 0; j < 3; j++)
					System.out.print(n1Arr[j]);
				break;
			} else if(n1Arr[i] == n2Arr[i]) {
				continue;
			} else { // n1Arr[i] < n2Arr[i]
				for(int j = 0; j < 3; j++)
					System.out.print(n2Arr[j]);
				break;
			}
		}
		
	}
}