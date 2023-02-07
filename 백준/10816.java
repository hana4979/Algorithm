import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());

		StringTokenizer hasToken = new StringTokenizer(bf.readLine());

		int[] hasArr = new int[n];
		for (int i = 0; i < n; i++) {
			hasArr[i] = Integer.parseInt(hasToken.nextToken());
		}

		Arrays.sort(hasArr); // 상근이가 가지고 있는 수 정렬

		int m = Integer.parseInt(bf.readLine());

		HashMap<Integer, Integer> numMap = new HashMap<>(); // 몇 개 가지고 있는지 체크할 HashMap

		StringTokenizer numToken = new StringTokenizer(bf.readLine());

		for (int i = 0; i < m; i++) {
			numMap.put(Integer.parseInt(numToken.nextToken()), 0);
		}

		Set<Integer> keys = numMap.keySet();
		for (Integer key : keys) { // key 전체 출력
			if (check(hasArr, key)) // 가지고 있는 숫자라면
				numMap.put(key, numMap.get(key) + 1); // numMap의 value +1
		}

		Collection<Integer> values = numMap.values();
		for (Integer value : values) {
			System.out.print(value + " ");
		}
	}

	public static boolean check(int[] arr, int num) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > num)
				high = mid - 1;
			else if (arr[mid] < num)
				low = mid + 1;
			else
				return true;
		}
		return false;
	}
}

// 230207 : 1 1 0 0 0 0 1 1 이라는 납득하기 힘든 결과가 나옴
