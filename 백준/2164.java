import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		Queue<Integer> card = new LinkedList<>();

		int n = Integer.parseInt(bf.readLine());

		// 1부터 n까지 삽입
		for (int i = 1; i <= n; i++) {
			card.offer(i);
		}

		for (int i = 0; i < n - 1; i++) {
			card.poll(); // card 큐에 첫번째 값 반환
			card.offer(card.poll()); // 그 다음으로 오는 값을 맨 밑으로 옮김
		}

		System.out.println(card.peek()); // 남은 수 반환

	}
}
