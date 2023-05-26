import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int[] arr = new int[5];
		int avg = 0;

		for (int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
			avg += arr[i];
		}

		Arrays.sort(arr); // 배열 정렬

		sb.append(avg / 5).append('\n').append(arr[2]); // 평균값과 중앙값 출력
		System.out.println(sb);

	}

}
