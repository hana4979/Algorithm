import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine()); // 시험 본 과목의 개수 N
		int[] score = new int[n]; // 현재 점수를 저장하고 정렬할 배열
		StringTokenizer token = new StringTokenizer(bf.readLine(), " "); // 현재 성적 입력
		double bestScore = 0; // 최고 점수 저장 변수

		for (int i = 0; i < n; i++) {
			score[i] = Integer.parseInt(token.nextToken()); // 배열에 점수 저장
		}

		Arrays.sort(score); // 배열 오름차순 정렬
		bestScore = score[n - 1]; // 최고 점수에 배열의 마지막 값 저장
		double[] newScore = new double[n]; // 새로운 점수를 double형으로 저장할 배열
		double sum = 0; // 평균을 구하기 위해 점수를 더할 변수

		for (int i = 0; i < n; i++) {
			newScore[i] = (double) score[i] / bestScore * 100.00; // 현재 점수 / 최고 점수 * 100 값 저장
			sum += newScore[i];
		}

		System.out.println(sum / n); // 평균 출력

		// 실제 정답과 출력값의 절대오차 또는 상대오차가 1/100 이하면 정답이다
	}
}
