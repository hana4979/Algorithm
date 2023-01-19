import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		// 상근이가 가지고 있는 숫자 카드
		int n = Integer.parseInt(bf.readLine());
		int[] haveArr = new int[n];

		StringTokenizer haveToken = new StringTokenizer(bf.readLine());

		for (int i = 0; i < n; i++)
			haveArr[i] = Integer.parseInt(haveToken.nextToken());

		Arrays.sort(haveArr); // 정렬로 비교하기 쉽도록 함

		// 주어진 숫자 카드
		int m = Integer.parseInt(bf.readLine());
		int[] givenArr = new int[m]; // 숫자와 빈도수를 저장할 2차원 배열

		StringTokenizer givenToken = new StringTokenizer(bf.readLine());

		for (int i = 0; i < m; i++)
			givenArr[i] = Integer.parseInt(givenToken.nextToken());

		// Cannot infer type arguments for
		ArrayList<Integer> haveList = new ArrayList<>(Arrays.asList(haveArr));

		for (int i = 0; i < n; i++) {
			int count = 0;
			while (haveList.contains(givenArr[i])) {
				count++;
			}

			System.out.print(count + " ");
		}

	}
}
