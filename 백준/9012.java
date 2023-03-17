import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static char[] psArr;
	public static int size = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(bf.readLine());

		for (int i = 0; i < T; i++) {
			String ps = bf.readLine();

			// 새로운 입력을 받기 전 배열과 사이즈 값 초기화
			psArr = new char[50];
			size = 0;

			// 배열에 괄호 넣기
			for (int j = 0; j < ps.length(); j++) {
				// (( == 40, )) == 41
				psArr[size++] = ps.charAt(j);
			}

			sb.append(vpsCheck(size)).append('\n');
		}

		System.out.println(sb);
	}

	public static String vpsCheck(int n) {
		// 맨 앞과 맨 뒤는 각각 '(', ')' 고정되어야 함
		// 괄호가 홀수개라면 VPS가 될 수 없음

		int check = 0;

		if (psArr[0] != '(' || psArr[n - 1] != ')' || n % 2 != 0)
			return "NO";
		else {
			check = 0;

			// ')' 일 때 +1, '(' 일 때 -1
			// 점수를 기록하는 check 변수가 - 되는 순간 VPS가 될 수 없음
			for (int i = 0; i < n; i++) {
				if (psArr[size - 1] == ')') {
					check++;
					size--;
				} else { // psArr[size-1] == '('
					check--;
					size--;

					if (check < 0)
						return "NO";
				}
			}
		}

		// 반례 ())))())
		// ')' 와 '(' 는 같은 수만큼 나와야 함
		if (check != 0)
			return "NO";
		else
			return "YES";

	}

}
