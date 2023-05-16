import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(bf.readLine(), " ");

		int N = Integer.parseInt(token.nextToken());
		int M = Integer.parseInt(token.nextToken());

		LinkedList<Integer> dq = new LinkedList<>();

		for (int i = 1; i <= N; i++)
			dq.offerLast(i);

		token = new StringTokenizer(bf.readLine(), " ");
		int mid_idx = 0; // 중간 인덱스 구하기
		int target_idx = 0; // 타겟 인덱스 구하기
		int count = 0;

		while (token.hasMoreTokens()) {
			
			target_idx = dq.indexOf(Integer.parseInt(token.nextToken())); // 뽑아야하는 숫자가 dq에서 몇번째 인덱스에 오는지 확인
			
			if(dq.size() % 2 == 0) // dq에 남은 수가 짝수개면
				mid_idx = dq.size() / 2 - 1; // 중심 인덱스에서 -1
			else
				mid_idx = dq.size() / 2;
			
			if (target_idx == 0) { // 타겟이 맨 앞에 있다면(뽑아야하면)
				dq.poll(); // 제거 (후 리턴)

			} else if (target_idx > mid_idx) { // 타겟이 중심보다 뒤에 있다면
				dq.offerFirst(dq.pollLast()); // 오른쪽으로 이동
				count++;

			} else { // 타겟이 중심보다 앞에 있다면
				dq.offerLast(dq.pollFirst()); // 왼쪽으로 이동
				count++;

			}

		}

		System.out.println(count);
	}
}

// 타겟 인덱스와 size를 기준으로한 중심 인덱스를 구하고 이를 비교하는 방식으로 변경
