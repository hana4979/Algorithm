import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer token = new StringTokenizer(bf.readLine(), " ");

		int N = Integer.parseInt(token.nextToken());
		int M = Integer.parseInt(token.nextToken());

		Deque<Integer> dq = new LinkedList<>();

		token = new StringTokenizer(bf.readLine());

		for (int i = 0; i < N; i++) {
			dq.offer(Integer.parseInt(token.nextToken()));

		}

		token = new StringTokenizer(bf.readLine(), " ");
		int pickNum = Integer.parseInt(token.nextToken());
		int count = 0;
		
		while (token.hasMoreTokens()) {
			if (dq.peek() == pickNum) {
				dq.poll();
				count++;
				pickNum = Integer.parseInt(token.nextToken());
				
			} else if (dq.peek() > pickNum) {
				dq.offerLast(dq.pollFirst());
				count++;
				
			} else {
				dq.offerFirst(dq.poll());
				count++;
				
			}

		}

		System.out.println(count);
	}
}
