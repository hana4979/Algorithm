import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		int[][] peopleSize = new int[n][2];

		for (int i = 0; i < n; i++) {
			StringTokenizer token = new StringTokenizer(bf.readLine(), " ");
			peopleSize[i][0] = Integer.parseInt(token.nextToken()); // 무게 입력
			peopleSize[i][1] = Integer.parseInt(token.nextToken()); // 키 입력
		}

		// rank를 1로 설정해두고 나보다 덩치큰 사람만큼 ++ 해준 뒤 출력
		// 굳이 배열을 정렬할 필요도 없고, rank 값을 따로 저장할 필요도 없음
		for (int i = 0; i < n; i++) {
			int rank = 1; //
			for (int j = 0; j < n; j++) {
				if (i == j)
					continue; // 같은 것끼리 비교할 필요 X
				// 무게가 같거나 더 나가고, 키가 더 크다면
				if (peopleSize[i][0] < peopleSize[j][0] && peopleSize[i][1] < peopleSize[j][1])
					rank++; // rank 뒤로 밀려남
			}

			System.out.print(rank + " ");

		}
	}
}

// https://st-lab.tistory.com/99 참고
// arrayList.sort(arr, Comparator...) 로 정렬할 필요 없이 '브루투포스' 를 이용한 문제임으로 하나씩 비교해서 "rank+k" 로 랭크 설정하면 됨