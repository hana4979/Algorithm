import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String str = bf.readLine();
		int rep = str.length();

		HashSet<Object> strSet = new HashSet<>();

		for (int i = 1; i <= rep; i++) { // 문자열 길이
			for (int j = 0; j < rep; j++) { // 문자열 시작 위치
				// 길이 초과 시 조건 달기
				strSet.add(str.substring(j, i)); // 시작 위치(j)부터 문자열 길이(j)만큼 자르기
			}
		}

		System.out.println(strSet.size());
	}
}
