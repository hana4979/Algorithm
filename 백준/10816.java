import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		// 상근이가 가지고 있는 숫자 카드
		int n = Integer.parseInt(bf.readLine());
		Integer[] haveArr = new Integer[n];

		StringTokenizer haveToken = new StringTokenizer(bf.readLine());

		for (int i = 0; i < n; i++)
			haveArr[i] = Integer.parseInt(haveToken.nextToken());

		// 주어진 숫자 카드
		int m = Integer.parseInt(bf.readLine());
		Integer[] givenArr = new Integer[m];
		int[] freqArr = new int[m]; // 빈도수 저장할 배열
		// 2차원 배열을 ArrayList로 바꾸고 contains 쓰는 방법을 몰라서 따로 생성

		StringTokenizer givenToken = new StringTokenizer(bf.readLine());

		for (int i = 0; i < m; i++) {
			givenArr[i] = Integer.parseInt(givenToken.nextToken());
			freqArr[i] = 0;
		}

		// .contains() 사용을 위해
		ArrayList<Integer> givenList = new ArrayList<>(Arrays.asList(givenArr));

		for (int i = 0; i < n; i++) {
			Integer num = haveArr[i];

			if (givenList.contains(num)) { // 주어진 수에 가지고 있는 수가 있는지 확인
				freq(givenArr, freqArr, num);
			}
		}

		// 출력
		for (int i = 0; i < m; i++) {
			System.out.print(freqArr[i] + " ");
		}
	}

	// 각 숫자의 빈도수 알아보기
	public static void freq(Integer[] givenArr, int[] freqArr, Integer num) {
		for (int i = 0; i < givenArr.length; i++) { // row(행)만큼 조사
			if (givenArr[i] == num) {
				freqArr[i]++;
			}
		}
	}
}

// 시간 초과
