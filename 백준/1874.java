import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(bf.readLine());
		int[] stack = new int[n]; // 수를 넣었다가 뽑을 스택
		int stackSize = 0;

		int[] seq = new int[n]; // 만들어야하는 수열
		int seqSize = 0;

		for (int i = 0; i < n; i++) {
			seq[i] = Integer.parseInt(bf.readLine());
		}

		int num = 1; // 1부터 n까지의 수
		
		// stack에 수를 입력해야하는 상황에만 num 증가
		// num이 n까지 다 입력되고, seqSize n개가 모두 조회될 때까지
		while (num < n || seqSize < n) {
			
			if (num < seq[seqSize]) { // num이 만들어야 하는 수열의 seqSize번째보다 작다면
				stack[stackSize++] = num; // num을 stack에 저장
				sb.append("+").append('\n');
				num++;

			} else if (num == seq[seqSize]) { // num이 만들어야 하는 수열의 seqSize번째라면
				sb.append("+").append('\n').append("-").append('\n'); // 수열에 넣었다 뺌을 의미
				seqSize++;
				num++;

			} else if (stack[stackSize - 1] == seq[seqSize]) { // stack 맨 위에 쌓여있는 수가 seqSize번째라면
				stack[stackSize - 1] = 0; // 스택 맨 위를 (임시 0으로)초기화
				stackSize--;
				sb.append("-").append('\n');
				seqSize++;

			} else { // 그 어떤 경우도 아니라면
				sb.setLength(0); // StringBuilder 초기화
				sb.append("NO");
				break;

			}
		}

		System.out.println(sb);
	}
}
