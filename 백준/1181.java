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
			
			lenArr[i][0] = strArr[i][0].length();
			lenArr[i][1] = i;
		}
		
		// 길이가 짧은 것부터 --> 사전 순 먼저 배열 하기
		// 문제1 : String은 Comparator했을 때 뭘 반환해야 할까
		Arrays.sort(strArr);
		/*
		 * Arrays.sort(strArr, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				return o1[0] - o2[0];
			}
		});
		*/
		
		// 배열 하나 더 생성한 뒤 해당 값 넣는 걸로
		String sortArr[] = new String[n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(Integer.parseInt(strArr[i][1]) == lenArr[j][1]) {
					sortArr[i] = strArr[j][0];
					break;
				}
			}
		}
		
		Arrays.sort(sortArr);
		
		for(String str : sortArr)
			System.out.println(str);

	}
}
