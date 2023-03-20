import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(bf.readLine());

		for (int i = 0; i < T; i++) {
			sb.append(vpsCheck(bf.readLine())).append('\n');
		}

		System.out.println(sb);
	}

	public static String vpsCheck(String ps) {
		int count = 0;

		if (ps.length() % 2 == 1)
			return "NO";
		else {
			for (int i = 0; i < ps.length(); i++) {
				if (ps.charAt(i) == '(')
					count++;
				else if (count == 0) // 닫는 괄호이면서, count에 더이상 pop할 값이 없다면
					return "NO";
				else // ps.charAt(i) == ')'
					count--;
			}

			if (count == 0)
				return "YES";
			else
				return "NO";
		}
	}
}
