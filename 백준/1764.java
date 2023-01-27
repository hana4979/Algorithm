import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;

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

		ArrayList<String> whoList = new ArrayList<>(); // 듣보잡을 저장할 ArrayList

		for (int i = 0; i < m; i++) {
			String unsight = bf.readLine();
			if (unhear.contains(unsight)) { // 듣도 못한 사람과 겹친다면
				whoList.add(unsight); // List에 저장
			}
		}

		// Arrays 정렬 시 java.lang.NullPointerException 오류가 떠서 ArrayList
		Collections.sort(whoList);
		System.out.println(whoList.size()); // 듣보잡의 수 출력
		for (int i = 0; i < whoList.size(); i++) {
			System.out.println(whoList.get(i));
		}
	}
}
