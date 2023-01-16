import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		HashMap<Integer, String> poketmon = new HashMap<Integer, String>();

		StringTokenizer token = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(token.nextToken()); // 도감에 수록되어 있는 포켓몬의 개수
		int m = Integer.parseInt(token.nextToken()); // 맞춰야 하는 문제의 개수

		for (int i = 0; i < n; i++) {
			poketmon.put(i, bf.readLine());
		}

		for (int j = 0; j < m; j++) {
			String information = bf.readLine();
			if (poketmon.containsKey(Integer.parseInt(information))) { // 숫자를 입력 받았다면
				System.out.println(poketmon.get(Integer.parseInt(information))); // 포켓몬 이름 출력
			} else if (poketmon.containsValue(information)) { // 포켓몬 이름을 입력 받았다면
				// System.out.println(poketmon.getKey()) // key출력을 어떻게 하냐
			}
		}
	}
}