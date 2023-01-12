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
		HashSet<String> haveSet = new HashSet<>();

		StringTokenizer haveToken = new StringTokenizer(bf.readLine(), " ");

		for (int i = 0; i < have; i++) {
			// 순서 상관없이 Set(집합)에 저장만 되면 됨
			haveSet.add(haveToken.nextToken());
		}

		// 주어진 숫자
		int num = Integer.parseInt(bf.readLine());
		StringTokenizer numToken = new StringTokenizer(bf.readLine(), " ");

		for (int i = 0; i < num; i++) {
			if (haveSet.contains(numToken.nextToken())) { // 주어진 숫자가 가지고 있는 숫자에 포함되어 있다면
				System.out.print(1 + " "); // 1 출력
			} else {
				System.out.print(0 + " "); // 0 출력
			}
		}
	}
}