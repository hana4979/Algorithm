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

		Queue<Integer> document;
		Integer[] importance; // 중요도를 담을 배열

		int t = Integer.parseInt(bf.readLine());

		while (t-- > 0) {
			document = new LinkedList<>();

			testToken = new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(testToken.nextToken()); // 문서의 개수
			int m = Integer.parseInt(testToken.nextToken()); // 궁금한 문서가 몇 번째에 놓여 있는지
			int count = 0; // m번째 있는 값이 몇번째로 출력되는지 담을 변수

			testToken = new StringTokenizer(bf.readLine());
			importance = new Integer[n];
			int v; // 중요도를 임시로 담아둘 변수

			for (int i = 0; i < n; i++) {
				v = Integer.parseInt(testToken.nextToken());
				document.offer(v);
				importance[i] = v;
			}

			Arrays.sort(importance); // 배열 오름차순 정렬

			int impSize = document.size(); // 큐 사이즈 임시로 담아둘 변수

			while (impSize > 0) {
				if (importance[impSize - 1] == document.peek()) { // 중요도가 가장 높은 문서가 첫번째에 와있다면
					document.poll(); // 문서 제거
					impSize--; // 그 다음으로 높은 중요도 불러오기
					count++;

					if (m == 0) { // 빼야하는 순서에 m이 맨 앞이었다면
						System.out.println(count); // 몇 번째로 빠져나왔는지 출력 후
						break; // 반복문 종료
					} else // 그렇지 않다면
						m--; // m 감소

				} else {
					document.offer(document.poll()); // 맨 앞에를 뽑아 뒤로 넘기기

					if (m == 0) // 뒤로 넘겨야하는 순서에 m이 맨 앞이었다면
						m = impSize - 1; // 맨 뒤를 가리키는 인덱스 값 부여
					else // 그렇지 않다면
						m--; // m 감소

				}
			}

		}

	}
}
