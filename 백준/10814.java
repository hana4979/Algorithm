import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		// 수정1 : char형으로 받기
		String[][] membership = new String[n][n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer token = new StringTokenizer(bf.readLine());
			for(int j = 0; j <= 1; j++) {
				membership[i][j] = token.nextToken();
			}
		}
		
		// 수정2 : 2차원 배열 오름차순 정렬
		/*
		Arrays.sort(membership, new Comparator<int[]>() {
			@Override
			public int compara(String[] o1, String[] o2) {
				if(o1[0] == o2[0]) {
					return 
				}
			}
		})
		*/
		
	}
}

// 출력 시 KeySet() 사용 --> 나이 중복의 경우 출력 X ==> Map 사용 불가
