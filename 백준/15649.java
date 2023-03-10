import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static char[][] starArr;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(bf.readLine(), " ");
		
		int N = Integer.parseInt(token.nextToken());
		int M = Integer.parseInt(token.nextToken());
		
		boolean[] numArr = new boolean[N];
		int check[] = new int[M];
		
		/*
		 * 백트래킹은 dfs 공부를 하고 풀 수 있는 것 같음, dfs부터 익히고 다시 풀어보기로.
		for(int i = 0; i < M; i++) {
		// numArr를 for문 돌때마다 !true로 설정(오래걸릴 것 같은데)
			for(int j = 0; j < N; j++) {
				if(numArr[j] != true) {
					check[i] = numArr[j];
				}
			}
		}
		*/
	}
}
