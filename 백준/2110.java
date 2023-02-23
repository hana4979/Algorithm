import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer token = new StringTokenizer(bf.readLine());

		int n = Integer.parseInt(token.nextToken()); // 집의 개수
		int c = Integer.parseInt(token.nextToken()); // 공유기 개수
		
		int[] houseArr = new int[n];
		
		for(int i = 0; i < n; i++) {
			houseArr[i] = Integer.parseInt(bf.readLine());
		}
		
		Arrays.sort(houseArr);
		
		// 인덱스 0, n-1에 공유기를 필수로 설치한다는 가정
		int min = 1;
		int max = n - 2;
		
		// 230223 : 나름 생각 중...
		while(min <= max) {
			int mid = (max - min) / 2 + min;
			
			if((houseArr[mid] - houseArr[0]) < (houseArr[max] - houseArr[mid])){
				mid = max + 1;
			} else
				mid = min - 1;
		}
		
		
		
		
		
	}
}
