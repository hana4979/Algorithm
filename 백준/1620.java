import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		// keySet() 사용 시 시간초과 문제로 HashMap 2개 사용
		HashMap<Integer, String> poketmonMap1 = new HashMap<Integer, String>();
		HashMap<String, Integer> poketmonMap2 = new HashMap<String, Integer>();

		StringTokenizer token = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(token.nextToken()); // 도감에 수록되어 있는 포켓몬의 개수
		int m = Integer.parseInt(token.nextToken()); // 맞춰야 하는 문제의 개수

		for (int i = 1; i <= n; i++) {
			String poketmon = bf.readLine();
			poketmonMap1.put(i, poketmon);
			poketmonMap2.put(poketmon, i);
		}

		for (int j = 0; j < m; j++) {
			String information = bf.readLine();
			if (poketmonMap2.containsKey(information)) { // 포켓몬 이름을 입력 받았다면
				System.out.println(poketmonMap2.get(information)); // 숫자 출력
			} else if (poketmonMap1.containsKey(Integer.parseInt(information))) { // 숫자를 입력 받았다면
				System.out.println(poketmonMap1.get(Integer.parseInt(information))); // 포켓몬 이름 출력
			}
		}
	}
}
