import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer token = new StringTokenizer(bf.readLine());
		
		int repeat = Integer.valueOf(token.nextToken());
		int width = Integer.valueOf(token.nextToken());
		int height = Integer.valueOf(token.nextToken());
		
		for(int i = 0; i < repeat; i++) {
			int match = Integer.parseInt(bf.readLine());
			
			// 성냥이 가로, 세로, 대각선 길이와 같거나 작으면 넣을 수 있음
			if(match <= width || match <= height || match <= Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2))) {
				System.out.println("DA");
			} else {
				System.out.println("NE");
			}
		}
	}
}

// + 대각선 길이는 가로, 세로 길이보다 항상 큼 