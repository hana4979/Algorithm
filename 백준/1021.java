import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(bf.readLine(), " ");

		int N = Integer.parseInt(token.nextToken());
		int M = Integer.parseInt(token.nextToken());

		Deque<Integer> dq = new LinkedList<>();

		for (int i = 1; i <= N; i++)
			dq.offerLast(i);

		token = new StringTokenizer(bf.readLine(), " ");
		int pickNum = Integer.parseInt(token.nextToken());
		int count = 0;

		while (token.hasMoreTokens()) {
			if (dq.peek() == pickNum) { // 뽑아야하는 숫자면
				dq.poll(); // 제거 (후 리턴)
				pickNum = Integer.parseInt(token.nextToken());

			} else if (dq.peek() > pickNum) { // 뽑아야하는 숫자가 맨 앞 숫자보다 작다면
				dq.offerFirst(dq.pollLast()); // 오른쪽으로 이동
				count++;

			} else { // 뽑아야하는 숫자가 맨 앞 숫자보다 크다면
				dq.offerLast(dq.pollFirst()); // 왼쪽으로 이동
				count++;

			}

		}

		System.out.println(count);
	}
}

// 230510 : 예제 입력 3, 4 틀린 답 나옴