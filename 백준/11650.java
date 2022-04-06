import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		
		int[] x = new int[n];
		int[] y = new int[n];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer str = new StringTokenizer(bf.readLine(), " ");
			x[i] = Integer.parseInt(str.nextToken());
			y[i] = Integer.parseInt(str.nextToken());
		}
		
		Arrays.sort(x); // 문제1. 먼저 정렬을 해버리면 이후 x[i]와 y[i]는 꼬임
		
		for(int i = 0; i < n; i++) {
			for(int j = 1; j < n; j++) {
				if(x[i] == x[j]) {
					if(y[i] > y[j])
						System.out.println(x[i] + " " + y[i]);
					else // y[i] < x[i]
						System.out.println(x[j] + " " + y[j]);
				} else
					System.out.println(x[i] + " " + y[i]);
			}
		}
		
		/*
		public static void swap(int[] y) { // swap 함수로 y 배열 위치 조정
			
		}
		*/
		
	}
}

// 220405 x와 y를 한 번에 받는 2차원 배열로 다시 풀기. 급히 내야하는 과제가 있어서 다시 시도 못 함 ㅜㅜ
