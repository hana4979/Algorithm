import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer token = new StringTokenizer(bf.readLine());

		int n = Integer.parseInt(token.nextToken()); // 카드의 개수
		int m = Integer.parseInt(token.nextToken()); // 기준이 되는 수
		int[] card = new int[n];

		StringTokenizer cardToken = new StringTokenizer(bf.readLine()); // 주어진 카드 설정
		for (int i = 0; i < n; i++) {
			card[i] = Integer.parseInt(cardToken.nextToken());
		}

		int closedNumber = 0; // 3개를 뽑았을 때 함이 m과 제일 가까운 경우
		int sum = 0; // 세 수의 합
		// 브루트 포스 (모든 경우의 수를 다 계산)
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j <= n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					sum = card[i] + card[j] + card[k];
					if ((m - sum >= 0) && (m - closedNumber > m - sum)) {
						closedNumber = sum;
					}
				}
			}
		}

		System.out.println(closedNumber);
	}
}