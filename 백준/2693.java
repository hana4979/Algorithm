import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(bf.readLine()); // TestCase t 입력 받기

		for (int i = 0; i < t; i++) {
			int[] numArr = new int[10]; // 크기 10짜리 배열 생성

			// 10개의 숫자를 하나의 문자열 형태로 입력 받기
			StringTokenizer token = new StringTokenizer(bf.readLine(), " ");

			// 배열에 " " 단위로 잘라 넣기
			for (int j = 0; j < 10; j++) {
				numArr[j] = Integer.parseInt(token.nextToken());
			}

			Arrays.sort(numArr); // 배열 오름차순 정렬

			System.out.println(numArr[7]); // 세번째로 큰 숫자(인덱스 7) 출력

		}

	}
}
