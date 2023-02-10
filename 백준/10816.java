import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());

		StringTokenizer token = new StringTokenizer(bf.readLine());

		int[] hasArr = new int[n];
		for (int i = 0; i < n; i++) {
			hasArr[i] = Integer.parseInt(token.nextToken());
		}

		Arrays.sort(hasArr); // 상근이가 가지고 있는 수 정렬

		int m = Integer.parseInt(bf.readLine());

		token = new StringTokenizer(bf.readLine());

		// 시간초과 해결방법 : 덧셈 연산이 많아질수록 성능저하(+ " ") --> StringBuilder로 문자열 연결
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < m; i++) {
			int num = Integer.parseInt(token.nextToken());
			// 상한 - 하한 = 해당 숫자가 몇번 나왔는지
			sb.append(upperBound(hasArr, num) - lowerBound(hasArr, num)).append(' ');
		}
		
		System.out.println(sb);
	}

	// 범위의 하한선 구하기
	public static int lowerBound(int[] arr, int num) {
		int low = 0;
		int high = arr.length;

		while (low < high) { // 같아질 때까지 반복
			int mid = (low + high) / 2;

			if (num <= arr[mid]) // num이 중간값보다 작거나 같다면
				high = mid; // 오른쪽 끝 인덱스를 중간값으로
			else // arr[mid] < num
				low = mid + 1; // 왼쪽 끝 인덱스를 중간값 + 1로
		}

		return low;
	}

	// 범위의 상한선 구하기
	public static int upperBound(int[] arr, int num) {
		int low = 0;
		// QQQ : 배열 길이로 설정한 이유 (arr.length - 1로 하면 안 되나?)
		// AAA : 이분 탐색은 사용자마다 구현 방식이 다르다. arr.length - 1로 잡으면 조건식이 달라져야 함
		int high = arr.length;

		while (low < high) {
			int mid = (low + high) / 2;

			if (num < arr[mid]) // num이 중간값보다 작다면
				high = mid; // 오른쪽 끝 인덱스를 중간값으로
			else // arr[mid] <= num
				low = mid + 1; // 왼쪽 끝 인덱스를 중간값 + 1로
		}

		return low;
	}
}

/*
 * upperBound lowerBound 알고리즘 참고
 * https://www.acmicpc.net/source/55609805
 */