import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		boolean[][] whitePaper = new boolean[101][101]; // 가로 세로 100 크기의 흰색 도화지
		
		int n = Integer.parseInt(bf.readLine());
		int row = 0;
		int col = 0;
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			StringTokenizer blackToken = new StringTokenizer(bf.readLine());
			
			row = Integer.parseInt(blackToken.nextToken());
			col = Integer.parseInt(blackToken.nextToken());
			// 10 * 10 의 검은 종이
			for(int j = row; j < row + 10; j++) {
				for(int k = col; k < col + 10; k++) {
					if(whitePaper[j][k] != true) { // 해당 구역이 true가 아니라면
						whitePaper[j][k] = true; // true로 바꿔주고(이미 존재한다는 표시)
						count++; // count 늘리기
					}
				}
			}
		}
		
		System.out.println(count);
	}
}
