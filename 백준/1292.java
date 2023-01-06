import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer numToken = new StringTokenizer(bf.readLine());

		int startNum = Integer.parseInt(numToken.nextToken()); // 시작구간
		int lastNum = Integer.parseInt(numToken.nextToken()); // 끝구간

		int[] sequence = new int[lastNum];
		int idx = 0;

		// 수열 만들기
		for (int i = 1; idx < lastNum; i++) {
			for (int j = 1; j <= i; j++) {
				if (idx == lastNum) // idx값이 끝 구간값에 도달하면
					break; // 배열에 더 이상 값을 넣을 수 없음
				sequence[idx++] = i;
			}
		}

		int result = 0;
		// 시작 구간부터 끝 구간까지의 정수 더하기
		for (int i = startNum - 1; i < lastNum; i++) {
			result += sequence[i];
		}

		System.out.println(result);
	}
}