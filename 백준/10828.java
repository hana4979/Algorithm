import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static Stack<Integer> stack;
	// 반복되는 print문 --> 시간 초과 발생
	public static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bf.readLine()); // 명령의 수
		String order;

		stack = new Stack<>(); // Java 스택 클래스
		sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			StringTokenizer token = new StringTokenizer(bf.readLine(), " ");
			order = token.nextToken();

			switch (order) {
			case "push":
				push(Integer.parseInt(token.nextToken()));
				break;

			case "pop":
				sb.append(pop()).append('\n');
				break;

			case "size":
				sb.append(size()).append('\n');
				break;

			case "empty":
				sb.append(empty()).append('\n');
				break;

			case "top":
				sb.append(top()).append('\n');
				break;
			}
		}

		System.out.println(sb);
	}

	// 정수 X를 스택에 넣음
	public static void push(int n) {
		stack.push(n);
	}

	// 스택 가장 위에 있는 정수를 빼고 그 수 출력, 정수가 없는 경우 -1 출력
	public static int pop() {
		if (stack.empty()) // 스택에서 뽑을 맨 위의 정수가 존재하지 않는다면
			return -1;
		else
			return stack.pop();
	}

	// 스택에 들어있는 정수의 개수 출력
	public static int size() {
		return stack.size();
	}

	// 스택이 비어있으면 1 아니면 0 출력
	public static int empty() {
		if (stack.empty())
			return 1;
		else
			return 0;
	}

	// 스택 가장 위에 있는 정수 출력, 정수가 없다면 -1 출력
	public static int top() {
		if (stack.empty())
			return -1;
		else
			return stack.peek();
	}
}
