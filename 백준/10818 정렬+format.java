import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		int[] arr = new int[n];
		
		String input = bf.readLine();
		StringTokenizer str = new StringTokenizer(input, " ");
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(str.nextToken()); // 정수로 변환하여 넣어주기
		}
		
		// 최대 최소 정렬로 풀기
		Arrays.sort(arr);
		
		System.out.printf("%d %d", arr[0], arr[n-1]);
		
	}
}