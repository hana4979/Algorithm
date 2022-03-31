import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testDate = Integer.parseInt(br.readLine()); // 테스트 데이터 값 받기
		
		int roomFront = 0; // 방 앞 번호
		int roomBack = 0; // 방 뒷 번호
		
		for(int i = 0; i < testDate; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int high = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken()); // 몇 번째 손님인지
			
			if(num % high == 0) { // 손님 % 층이 0이라면
				roomFront = high; // 방 앞 번호는 높이
				roomBack = num / high; // 방 뒷 번호는 손님 / 높이 값
			} else {
				roomFront = num % high;
				roomBack = num / high + 1;
			}
			
			System.out.println(roomFront * 100 + roomBack);
		}
	}
}