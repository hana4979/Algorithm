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
		int[][] arr = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			StringTokenizer str = new StringTokenizer(bf.readLine(), " ");
			arr[i][0] = Integer.parseInt(str.nextToken());
			arr[i][1] = Integer.parseInt(str.nextToken());
		}
		
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] row1, int[] row2) { // 열비교
				if(row1[1] == row2[1]) // 두번째 열(=y좌표) 같다면
					return row1[0] - row2[0]; // x좌표 값으로 정렬
				else // 같지 않다 == 정렬할 수 있다
					return row1[1] - row2[1]; // y좌표 값으로 정렬
			}
		});
		
		for(int i = 0; i < n; i++)
			System.out.println(arr[i][0] + " " + arr[i][1]);

	}
}
// 실행속도 더 빠른 코드 분석해보기