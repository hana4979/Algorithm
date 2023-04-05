import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(bf.readLine());

		for (int i = 0; i < t; i++) {
			String str = bf.readLine();

			// charAt(length - 1) : 마지막 문자열
			sb.append(str.charAt(0)).append(str.charAt(str.length() - 1)).append('\n');
		}

		System.out.println(sb);
	}
}
