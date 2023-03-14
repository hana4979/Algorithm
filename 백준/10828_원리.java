import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// stack 클래스 사용하지 않고 풀이 + 시간 단축 초점

public class Main {

	public static int[] stack;
	public static int size = 0; // 현재 스택 사이즈

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer token; // while문 밖에서 선언하면 매번 불러올 필요 없음

		int N = Integer.parseInt(bf.readLine());

		stack = new int[N];

		// while문 조건에서 ' --> 0 '
		// -- (증감 연산자) + > (꺽쇠 괄호) == 0보다 조건 값을 뺀 값이 클 경우

		while (N-- > 0) {
			token = new StringTokenizer(bf.readLine(), " ");

			switch (token.nextToken()) {

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

	public static void push(int num) {
		stack[size++] = num;
	}

	public static int pop() {
		if (size == 0)
			return -1;
		else {
			int result = stack[size - 1]; // 가장 위에 있는 정수 임시로 저장
			stack[size - 1] = 0; // 0으로 초기화
			size--;
			return result;
		}
	}

	public static int size() {
		return size;
	}

	public static int empty() {
		if (size == 0)
			return 1;
		else
			return 0;
	}

	public static int top() {
		if (size == 0)
			return -1;
		else
			return stack[size - 1];
	}

}