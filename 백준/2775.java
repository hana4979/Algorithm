import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(bf.readLine()); // Test Case
		
		int[][] apartPeople = new int[15][15]; // 2차원 배열 선언
			
		// 공통 부분 설정
		for(int i = 1; i < 15; i++ ) {
			apartPeople[i][1] = 1; // 각 층 1호에 1명 넣기
			apartPeople[0][i] = i; // 0층 인구 넣기
		}
			
		// 핵심 : a층 b호 = a층 (b-1)호 + (a-1)층 b호
		for(int i = 1; i < 15; i++) {
			for(int j = 2; j < 15; j++) {
				apartPeople[i][j] = apartPeople[i][j-1] + apartPeople[i-1][j];
			}
		}
			
		for(int i = 0; i < testCase; i++) {
			int floor = Integer.parseInt(bf.readLine()); // 층수
			int unit = Integer.parseInt(bf.readLine()); // 호
			
			System.out.println(apartPeople[floor][unit]);
		}
	}
}