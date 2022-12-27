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

		// 정렬 후 순서대로 rank 부여, peopleSize 와 비교해 기존 배열 순서대로 rank 나열
		ArrayList<int[][]> compareSize = new ArrayList<int[][]>();

		int[] rank = new int[n];
		// 덩치 비교(해야됨)
		int weight = peopleSize[0][0];
		int ranking = 1;
		for (int i = 1; i < n; i++) {
			if (weight <= peopleSize[i][0]) {
				weight = peopleSize[i][0];
				rank[i] = ranking;
				ranking++;
			} else {
				// 이렇게하면안될것같다는느낌이왔는데시간이없네;-;
				ranking++;
			}
		}

	}
}