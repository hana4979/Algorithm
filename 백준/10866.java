import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer token;

		Deque<Integer> deq = new LinkedList<>();

		int n = Integer.parseInt(bf.readLine());

		while (n-- > 0) {
			token = new StringTokenizer(bf.readLine());
			String order = token.nextToken();

			switch (order) {
			case "push_front":
				deq.offerFirst(Integer.parseInt(token.nextToken()));
				break;

			case "push_back":
				deq.offerLast(Integer.parseInt(token.nextToken()));
				break;

			case "pop_front":
				if (deq.size() == 0)
					sb.append(-1).append('\n');
				else
					sb.append(deq.pollFirst()).append('\n');
				break;

			case "pop_back":
				if (deq.size() == 0)
					sb.append(-1).append('\n');
				else
					sb.append(deq.pollLast()).append('\n');
				break;

			case "size":
				sb.append(deq.size()).append('\n');
				break;

			case "empty":
				if (deq.isEmpty())
					sb.append(1).append('\n');
				else
					sb.append(0).append('\n');
				break;

			case "front":
				if (deq.size() == 0)
					sb.append(-1).append('\n');
				else
					sb.append(deq.peekFirst()).append('\n');
				break;

			case "back":
				if (deq.size() == 0)
					sb.append(-1).append('\n');
				else
					sb.append(deq.peekLast()).append('\n');
				break;

			}
		}

		System.out.println(sb);
	}
}
