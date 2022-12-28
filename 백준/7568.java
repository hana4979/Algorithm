import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		int[][] peopleSize = new int[n][1];

		for (int i = 0; i < n; i++) {
			StringTokenizer token = new StringTokenizer(bf.readLine(), " ");
			peopleSize[i][0] = Integer.parseInt(token.nextToken()); // 무게 입력
			peopleSize[i][1] = Integer.parseInt(token.nextToken()); // 키 입력
		}

		// 2차원 배열 복사
		int[][] compareSize = new int[n][1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				compareSize[i][j] = peopleSize[i][j];
			}
		}
		
		// https://crazykim2.tistory.com/463 오류 왜 뜨냐 진짜 ㅡㅡ
		// 정렬 후 순서대로 rank 부여, peopleSize 와 비교해 기존 배열 순서대로 rank 나열
		Arrays.sort(compareSize, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// 첫번째 기준 오름차순, 두번째 기준 오름차순
				return o1[0] != o2[0] ? o1[0] - o2[0] : o1[1] - o2[1];
			}
		});

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (compareSize[i][0] == peopleSize[j][0])
					if (compareSize[i][1] == peopleSize[j][1])
						System.out.print(j + " ");
					else {
						continue;
					}
			}
		}
	}
}