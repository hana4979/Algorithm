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

		for (int i = 0; i < rep; i++) { // 문자열 시작 위치
			for (int j = i + 1; j <= rep; j++) { // 문자열 길이
				strSet.add(str.substring(i, j)); // 시작 위치부터 몇글자 뽑아낼 것인지
			}
		}

		System.out.println(strSet.size());
	}
}
