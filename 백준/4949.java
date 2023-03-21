import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = bf.readLine();

		while (!str.equals(".")) {

			sb.append(balanceCheck(str)).append('\n');

			str = bf.readLine(); // 새로운 입력
		}

		System.out.println(sb);

	}

	public static String balanceCheck(String str) {

		Stack<Character> stack = new Stack<>();
		char c;

		for (int i = 0; i < str.length() - 1; i++) {

			c = str.charAt(i); // 한 글자씩 검사

			if (!(c == '(' || c == ')' || c == '[' || c == ']')) { // 괄호가 아닌 값
				continue; // 다음으로 넘기기

			} else if (c == '(' || c == '[')
				stack.push(c);

			else if (stack.empty())
				return "NO";

			else if (c == ')') {
				if (stack.peek() == '(')
					stack.pop();
				else
					return "NO";

			} else { // c == ']'
				if (stack.peek() == '[')
					stack.pop();
				else
					return "NO";
			}

		}

		if (stack.empty()) // 모든 괄호가 제 짝을 찾았다면
			return "YES";
		else
			return "NO";

	}

}

// 230321 틀린 이유가 뭘까. 반례를 찾아보자.
