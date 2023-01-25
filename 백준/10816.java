import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		// 상근이가 가지고 있는 숫자 카드
		int n = Integer.parseInt(bf.readLine());
		String[] haveArr = new String[n];

		StringTokenizer haveToken = new StringTokenizer(bf.readLine());

		for (int i = 0; i < n; i++)
			haveArr[i] = haveToken.nextToken();
		
		// 주어진 숫자 카드
		int m = Integer.parseInt(bf.readLine());
		Integer[][] givenArr = new Integer[m][1]; // 빈도수까지 저장할 2차원 배열

		StringTokenizer givenToken = new StringTokenizer(bf.readLine());

		for (int i = 0; i < m; i++)
			givenArr[i][0] = Integer.parseInt(givenToken.nextToken());

		// .contains() 사용을 위해
		ArrayList<String> haveList = new ArrayList<>(Arrays.asList(haveArr));

		for (int i = 0; i < m; i++) {
			Integer num = givenArr[i][0];
			
			if(haveList.contains(num)) {
				freq(givenArr, num);
			}
		}
		
		// 출력
		for(int i = 0; i < m; i++) {
			System.out.print(givenArr[i][1] + " ");
		}
	}
	
	// 각 숫자의 빈도수 알아보기
	public static void freq(Integer[][] givenArr, Integer str) {
		for(int i = 0; i < givenArr.length; i++) { // row(행)만큼 조사
			if(givenArr[i][0].equals(str)) {
				givenArr[i][1]++;
			}
		}
	}
}
