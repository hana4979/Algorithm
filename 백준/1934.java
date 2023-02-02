import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());

		for (int i = 0; i < n; i++) {
			StringTokenizer token = new StringTokenizer(bf.readLine());

			int a = Integer.parseInt(token.nextToken());
			int b = Integer.parseInt(token.nextToken());

			// 최대공배수 = a * b / (최소공약수)
			System.out.println(a * b / GCD(a, b)); // 최대공배수
		}

	}

	// 유클리드 호제법을 이용한 최대공약수(GCD) 구하기
	public static int GCD(int a, int b) {
		int tmp, n;

		// a에 큰 값을 넣기
		if (a < b) {
			tmp = a;
			a = b;
			b = tmp;
		}

		// 유클리드 알고리즘
		while (b != 0) { // b(a % b의 나머지)가 0이 될 때까지
			n = a % b;
			a = b;
			b = n;
		}

		return a;

	}
}
