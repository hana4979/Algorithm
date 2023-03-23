import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(bf.readLine());
		int[] stack = new int[n];
		int size = 0;

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(bf.readLine());

			if (i < num) {
				stack[size++] = i;
				sb.append("+").append('\n');

			} else if (i == num) {
				sb.append("+").append('\n').append("-").append('\n');

			} else if (stack[size - 1] == num) {
				stack[size - 1] = 0;
				size--;
				sb.append("-").append('\n');

			} else {
				sb.setLength(0); // StringBuilder 초기화
				sb.append("NO");
			}
		}

		System.out.println(sb);
	}
}
