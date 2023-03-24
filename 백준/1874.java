import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(bf.readLine());
		int[] stack = new int[n];
		int stackSize = 0;

		int[] seq = new int[n]; // 만들어야하는 수열
		int seqSize = 0;

		for (int i = 0; i < n; i++) {
			seq[i] = Integer.parseInt(bf.readLine());
		}

		for (int i = 1; i <= n; i++) {

			if (i < seq[seqSize]) {
				stack[stackSize++] = i;
				sb.append("+").append('\n');

			} else if (i == seq[seqSize]) {
				sb.append("+").append('\n').append("-").append('\n');
				seqSize++;

			} else if (stack[stackSize - 1] == seq[seqSize]) {
				stack[stackSize - 1] = 0;
				stackSize--;
				sb.append("-").append('\n');
				seqSize++;

			} else {
				sb.setLength(0); // StringBuilder 초기화
				sb.append("NO");
			}
		}

		System.out.println(sb);
	}
}

// 230324 코드가 심하게 꼬인 느낌. 오직 pop()만 진행해야할 때 입력값을 keep해야함