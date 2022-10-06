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
		int a = Integer.parseInt(token.nextToken());
		int b = Integer.parseInt(token.nextToken());

		System.out.println(a * b / lcf(a, b)); // a * b / 최소공약수 == 최대공배수
	}

	// 최소공약수 구하기
	static int lcf(int a, int b) {
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
}
