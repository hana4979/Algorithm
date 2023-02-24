import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer token = new StringTokenizer(bf.readLine(), " ");

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
		int mid = 0;
		int gab = 0; // 거리의 최대값을 확인할 gab
		
		while(min <= max) {
			mid = (max - min) / 2 + min;
			gab = houseArr[max] - houseArr[min];
			
			// 230224 거짓말아니고 도합 3시간동안 고민했는데 감도 안 잡힘
			/*
			 * 양 끝을 제외한 범위에 공유기 n - 2개가 설치될 수 있는지 확인
			 * 설치될 수 있다면 값이 최대값인지 확인
			 */
			
			if(){
				mid = max + 1;
			} else
				mid = min - 1;
			
			/*
			System.out.println("max : " + max);
			System.out.println("min : " + min);
			*/
		}
		
		
		
		System.out.print(mid);
		
		
		
		
		
	}
}
