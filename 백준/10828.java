import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bf.readLine()); // 명령의 수
		String order;

		Stack<Integer> stack = new Stack<>(); // Java 스택 클래스

		for (int i = 0; i < N; i++) {
			StringTokenizer token = new StringTokenizer(bf.readLine(), " ");
			order = token.nextToken();

			if (order.equals("pop")) {
				if (stack.empty()) { // 스택에서 뽑을 맨 위의 정수가 존재하지 않는다면
					System.out.println(-1); // -1 출력
				} else {
					System.out.println(stack.pop());
				}
			} else if (order.equals("size")) {
				System.out.println(stack.size());
			} else if (order.equals("empty")) {
				if (stack.empty()) {// 스택이 비어있다면
					System.out.println(1); // 1 출력
				} else { // 스택이 비어있지 않다면
					System.out.println(0); // 0 출력
				}
			} else if (order.equals("top")) {
				if (stack.peek() != null) {
					System.out.println(stack.peek()); // 스택 가장 위에 있는 정수 출력
				} else {
					System.out.println(-1);
				}
			} else { // push num
				stack.push(Integer.parseInt(token.nextToken()));

			}
		}

	}
}

// 런타임에러
