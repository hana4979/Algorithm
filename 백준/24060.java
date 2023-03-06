import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.Comparable;

public class Main {

	// 전역변수는 메소드 안에서 값 변경 가능
	public static int count;
	public static Object saveNum;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer token = new StringTokenizer(bf.readLine(), " ");

		int A = Integer.parseInt(token.nextToken()); // 배열 A의 크기
		int K = Integer.parseInt(token.nextToken()); // 저장 횟수 K

		/*
		 * Comparable<T>[] 선언 isless 메소드에서 compareTo() 사용으로 비교하기 위함
		 */
		Comparable<Integer>[] numArr = new Comparable[A]; // 원소 담을 배열

		StringTokenizer numToken = new StringTokenizer(bf.readLine(), " "); // 배열의 원소

		// 배열에 원소 등록
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = Integer.parseInt(numToken.nextToken());
		}

		// 보조 배열 b 생성
		Comparable[] b = new Comparable[numArr.length];
		sort(numArr, b, 0, numArr.length - 1, K);

		/*
		 * for(int i = 0; i < b.length; i++) System.out.print(b[i] + " ");
		 */

		if (saveNum == null) // 저장횟수가 K보다 작다면
			saveNum = -1; // -1 반환

		System.out.println(saveNum);
	}

	public static void merge(Comparable[] a, Comparable[] b, int low, int mid, int high, int K) {
		int i = low, j = mid + 1; // low ~ mid 와 mid + 1 ~ high 나눔
		for (int k = low; k <= high; k++) {
			if (mid < i) // 앞부분이 먼저 소진된 경우
				b[k] = a[j++];
			else if (high < j) // 뒷부분이 먼저 소진된 경우
				b[k] = a[i++];
			else if (isless(a[j], a[i])) // a[j]가 승자
				b[k] = a[j++];
			else // a[i]가 승자
				b[k] = a[i++];
		}

		for (int k = low; k <= high; k++) {
			a[k] = b[k];

			if (++count == K) // 수가 저장될 때마다 count 증가, K번째 저장되면
				saveNum = b[k]; // saveNum에 해당 숫자 저장
		}
	}

	public static void sort(Comparable[] a, Comparable[] b, int low, int high, int K) {
		if (high <= low) {
			return;
		}

		int mid = low + (high - low) / 2;

		sort(a, b, low, mid, K); // 앞부분 재귀호출
		sort(a, b, mid + 1, high, K); // (앞부분의)뒷부분 재귀호출
		merge(a, b, low, mid, high, K);
	}

	public static boolean isless(Comparable<Comparable> v, Comparable w) {
		return (v.compareTo(w) < 0);
	}
}
