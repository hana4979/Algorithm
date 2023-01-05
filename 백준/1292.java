import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer numToken = new StringTokenizer(bf.readLine());
		
		int startNum = Integer.parseInt(numToken.nextToken());
		int lastNum = Integer.parseInt(numToken.nextToken());
		
		int[] sequence = new int[lastNum + 1];
		int idx = 0;
		
		// 수열 만들기 (오류수정하기)
		for(int i = 1; idx < lastNum; i++) {
			for(int j = 1; j <= i; j++) {
				sequence[idx] = i;
				idx++;
			}
		}
		
		int result = 0;
		// 시작 구간부터 끝 구간까지의 정수 더하기
		for(int i = startNum; i <= lastNum; i++) {
			result += sequence[i];
		}
		
		System.out.println(result);
	}
}