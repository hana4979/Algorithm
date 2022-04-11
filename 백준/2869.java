import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int day = Integer.parseInt(st.nextToken()); // 낮에 올라가는 미터
			int night = Integer.parseInt(st.nextToken()); // 밤에 내려가는 미터
			int destination = Integer.parseInt(st.nextToken()); // 목적지
			
			// (destination -= (day - night)) == 0
			// (destination - day + night) == 0
			/*while((destination -= day) > 0) {
				countDay++;
				destination += night;
			}*/

			int value = (destination-night)/(day-night);
			
			// destination - (day * n) + (night * (n-1)) < 0
			if((destination-night)%(day-night)!=0)
				value++;
			
			System.out.println(value);
	}
}
