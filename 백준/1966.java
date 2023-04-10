import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer testToken;

		Queue<Integer> document = new LinkedList<>();
		Integer[] importance; // 중요도를 담을 배열

		int t = Integer.parseInt(bf.readLine());

		while (t-- > 0) {
			testToken = new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(testToken.nextToken()); // 문서의 개수
			int m = Integer.parseInt(testToken.nextToken()); // 궁금한 문서가 몇 번째에 놓여 있는지

			testToken = new StringTokenizer(bf.readLine());
			importance = new Integer[n];
			int v; // 중요도를 임시로 담아둘 변수
			for (int i = 0; i < n; i++) {
				v = Integer.parseInt(testToken.nextToken());
				document.offer(v);
				importance[i] = v;
			}

			Arrays.sort(importance); // 배열 오름차순 정렬

			int impSize = document.size() - 1; // (큐 - 1) 사이즈 임시로 담아둘 변수
			while (document.size() != 0) {
				if (importance[impSize] == document.peek()) { // 중요도가 가장 높은 문서가 첫번째에 와있다면
					document.poll(); // 문서 제거
					impSize--; // 그 다음으로 높은 중요도 불러오기
				}
			}

		}

	}
}
