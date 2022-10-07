import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// https://cobook.tistory.com/49
public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		// 유클리드 호제법으로 최대공약수 구하기
		StringTokenizer token = new StringTokenizer(bf.readLine(), " ");
		
		int checkNum = Integer.parseInt(token.nextToken());
		if(checkNum > 1000) {
			// long 타입인데 Integer로 받아도 되나?
			long a_long = checkNum;
			long b_long = Integer.parseInt(token.nextToken());
			System.out.println(a_long * b_long / long_lcf(a_long, b_long)); // a * b / 최소공약수 == 최대공배수
		} else {
			int a_int = checkNum;
			int b_int = Integer.parseInt(token.nextToken());
			System.out.println(a_int * b_int / int_lcf(a_int, b_int)); // a * b / 최소공약수 == 최대공배수
		}
	}

	// 최소공약수 구하기
	static int int_lcf(int a, int b) {
		// 유클리드 호제법 조건 (a > b)
		if (a < b) { // b가 a보다 크다면
			// a와 b를 바꿈
			int temp = a;
			a = b;
			b = temp;
		}

		while (b != 0) { // 유클리드 호제법
			int r = a % b;
			a = b;
			b = r;
		}
		
		return a; // 최대 공약수 반환
	}
	
	static long long_lcf(long a, long b) {
		// 유클리드 호제법 조건 (a > b)
		if (a < b) { // b가 a보다 크다면
			// a와 b를 바꿈
			long temp = a;
			a = b;
			b = temp;
		}

		while (b != 0) { // 유클리드 호제법
			long r = a % b;
			a = b;
			b = r;
		}
		
		return a; // 최대 공약수 반환
	}
}
