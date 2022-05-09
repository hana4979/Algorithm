import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		boolean[] seatArr = new boolean[100]; // 기본 설정 false
		int rejection = 0;
		
		StringTokenizer token = new StringTokenizer(bf.readLine(), " ");
		
		while(token.hasMoreTokens()) {
			int reserveSeat = Integer.parseInt(token.nextToken())-1;
			
			if(!seatArr[reserveSeat]) { // 예약이 안 되어 있다면
				seatArr[reserveSeat] = true;
			} else { // 예약이 되어 있다면
				rejection ++;
			}
		}
		
		System.out.println(rejection);
	}
}
