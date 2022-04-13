import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

class strArr{
	
}

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		
		String[][] strArr = new String[n][2];
		int[][] lenArr = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			strArr[i][0] = bf.readLine();
			strArr[i][1] = String.valueOf(i);
			
			lenArr[i][0] = strArr[i][0].length();
			lenArr[i][1] = i;
		}
		
		Arrays.sort(lenArr);
		
		// 배열 하나 더 생성한 뒤 해당 값 넣는 걸로
		String sortArr[] = new String[n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(lenArr[i][1] == Integer.parseInt(strArr[j][1])) {
					sortArr[i] = strArr[j][0];
				}
			}
		}
		
		for(String str : sortArr)
			System.out.println(str);
		
		
		/* 이건 아닌 듯 ㅡㅡ
		// 1. 두 배열 다 행 정렬
		Arrays.sort(strArr); // 사전 순
		Arrays.sort(lenArr); // 글자 크기 순
		
		// 2. 글자 기준으로 비교, 같은 게 있다면 strArr에 int로 변환한 열값 찾아내서 정렬시도
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++)
			if(strArr[i][0].length() == lenArr[j][0]) {
				
			}
		}
		*/

	}
}
