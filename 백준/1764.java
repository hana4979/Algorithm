import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer token = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(token.nextToken());
		int m = Integer.parseInt(token.nextToken());

		HashSet<String> unhear = new HashSet<String>();
		for (int i = 0; i < n; i++) {
			unhear.add(bf.readLine());
		}

		m = Math.max(n, m); // n과 m을 비교했을 때 더 큰 수를 m으로 지정

		int count = 0;
		String[] whoArr = new String[m];

		for (int i = 0; i < m; i++) {
			String unsight = bf.readLine();
			if (unhear.contains(unsight)) { // 듣도 못한 사람과 겹친다면
				whoArr[i] = unsight;
				count++;
			}
		}

		// java.lang.NullPointerException
		Arrays.sort(whoArr);
		System.out.println(count);

		for (int i = 0; i < whoArr.length; i++) {
			System.out.println(whoArr[i]);
		}
	}
}
