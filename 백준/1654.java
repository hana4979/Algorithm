import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer token = new StringTokenizer(bf.readLine());

		int k = Integer.parseInt(token.nextToken()); // 가지고 있는 랜선의 개수
		int n = Integer.parseInt(token.nextToken()); // 필요한 랜선의 개수

		int[] arr = new int[k];

		long min = 0; // 길이의 최소값
		long max = 0; // 입력받은 값 중 최댓값
		long mid = 0;
		
		for (int i = 0; i < k; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
			if (max < arr[i])
				max = arr[i];
		}

		/*
		 * 이분 탐색의 범위는 랜선의 길이
		 * key값 == 만들고자 하는 랜선 개수(N)
		 * => 특정 개수에 대한 특정 길이 찾기
		 */
		
		/*
		 * min = 0, max = 1 의 경우
		 * 43번째 줄 : count += arr[i] / mid; 에서 by zero 오류 발생
		 * 1. max + 1 값을 탐색
		 * 2. int의 최댓값까지의 범위가 주어졌으니 자료형을 long으로 바꿔주기
		 */
		max++;
		
		while (min < max) {
			mid = (max + min) / 2;

			long count = 0;

			// 중간 길이로 잘랐을 때 총 몇개의 랜선이 만들어지는지 확인
			for (int i = 0; i < k; i++) {
				// by zerp 오류 주의!
				count += (arr[i] / mid);
			}

			if (count < n)
				// 더 많은 랜선을 요구하므로 작게 잘라야 함
				max = mid;
			else
				// 랜선 개수가 맞게 나와도 '최댓값'을 구해야 하기 때문에 min을 꾸준히 증가
				min = mid + 1;
			
			/*
			 * min = mid + 1
			 * UpperBound(상한)은 찾고자 하는 특정 값을 초과하는 첫 위치를 반환
			 * +1 을 하지 않았을 경우 소수점 반영이 안 되어(올림) 수가 되풀이 되기도 함
			 * 백준 예제로 봐도 min 200 / max 201 에서 무한 반복
			 */
			
		}
		
		/* 
		 * UpperBound는 중복 원소 '바로 다음' 인덱스를 찾음
		 * 따라서 -1 을 해주어야 원하는 랜선 개수(중복값)를 만들 수 있는 최대 길이를 출력 가능
		 */
		
		// 얻어진 값(min)에 -1을 해야 최대 길이
		System.out.println(min - 1);
	}
}

// 알고리즘 : https://st-lab.tistory.com/269
// 아예 min = 1 로 잡고 알고리즘 짜도 가능