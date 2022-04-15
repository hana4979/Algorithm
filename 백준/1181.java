import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		
		String[][] strArr = new String[n][2];
		int[][] lenArr = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			strArr[i][0] = bf.readLine();
			strArr[i][1] = String.valueOf(i);
		}
		
		// 길이가 짧은 것부터 --> 사전 순 먼저 배열 하기
		Arrays.sort(strArr, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				return o1[0].toString().compareTo(o2[1].toString());
			}
		});
		
		// 사전 순 정렬을 기반으로 길이 순대로 lenArr에 넣기.. 가 안 됨.
		// if를 건들여야 되나
		for(int i = 0; i < n; i++) {
			lenArr[i][0] = strArr[i][0].length();
			lenArr[i][1] = i;
		}
		
		Arrays.sort(lenArr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		
		// 배열 하나 더 생성한 뒤 해당 값 넣는 걸로
		String sortArr[] = new String[n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(lenArr[i][1] == Integer.parseInt(strArr[j][1])) {
					sortArr[i] = strArr[j][0];
					break;
				}
			}
		}
		
		for(String str : sortArr)
			System.out.println(str);

	}
}

// 1. 사전 순 배열 기반으로 글자 수대로 정렬이 안 됨
// 220415 하 일단 시험 끝나고 다시 해보는 걸로 도저히 모르겠다
