import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int c = Integer.parseInt(bf.readLine()); // TestCase 개수 c 입력 받기

		for (int i = 0; i < c; i++) {
			StringTokenizer token = new StringTokenizer(bf.readLine(), " ");

			int student = Integer.parseInt(token.nextToken()); // 학생 수
			int[] score = new int[student]; // 학생 수 만큼 점수를 받기 위한 배열
			int sum = 0; // 평균을 구하기 위한 합계

			for (int j = 0; j < student; j++) {
				score[j] = Integer.parseInt(token.nextToken()); // score 배열에 점수 넣기
				sum += score[j]; // 나온 점수 더하기
			}

			int scoreAverage = sum / student; // 점수 평균
			int count = 0; // 평균 넘는 학생의 수

			for (int k = 0; k < student; k++) {
				if (score[k] >= scoreAverage) { // 평균보다 점수가 높다면
					count++; // 평균 넘는 학생 수 증가
				}
			}
			
			// 출력값 수정 필요
			// String.foramt("%.3", n) --> 소수 넷째자리에서 반올림 하여 세자리 표시
			System.out.println(String.format("%.3f", (double)(score / student))); // 평균 넘는 학생들의 비율
			
		}

	}
}
