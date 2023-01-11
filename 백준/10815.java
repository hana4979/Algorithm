import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		// 상근이가 가지고 있는 숫자
		int have = Integer.parseInt(bf.readLine());

		StringTokenizer haveToken = new StringTokenizer(bf.readLine());

		// 주어진 숫자
		HashSet<String> numSet = new HashSet<>();

		// 헐 토큰 중복 저장 못해?
		StringTokenizer numToken = new StringTokenizer(bf.readLine());

		while (numToken.hasMoreTokens()) { // token이 떨어질 때까지 집합에 값 넣기
			numSet.add(numToken.nextToken());
		}

		for (int i = 0; i < have; i++) {
			if (numSet.contains(haveToken.nextToken())) { // set에 값이 포함되어 있다면
				System.out.print(1 + " "); // 1 출력
			} else {
				System.out.print(0 + " "); // 0 출력
			}
		}
	}
}