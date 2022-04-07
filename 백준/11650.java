import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());

		int[][] coor = new int[n][2];

		for (int i = 0; i < n; i++) {
			StringTokenizer str = new StringTokenizer(bf.readLine(), " ");
			coor[i][0] = Integer.parseInt(str.nextToken()); // x좌표 저장
			coor[i][1] = Integer.parseInt(str.nextToken()); // y좌표 저장
		}
		
		// 2차원 배열 정렬 (다중 배열 정렬)
		Arrays.sort(coor, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) // 0번째 열이 같으면
					return o1[1] - o2[1]; // 1번째 열로 비교
				else
					return o1[0] - o2[0]; // 다르다면 0번째 열로 비교
			}
		});
		
		for(int i = 0; i < n; i++) {
			System.out.println(coor[i][0] + " " + coor[i][1]);
		}

	}
}

// 220405 x와 y를 한 번에 받는 2차원 배열로 다시 풀기. 급히 내야하는 과제가 있어서 다시 시도 못 함 ㅜㅜ
// 220407 다중 배열 정렬이라는 것이 있다더라.
