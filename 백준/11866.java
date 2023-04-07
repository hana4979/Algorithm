import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		sb.append("<");

		StringTokenizer token = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(token.nextToken());
		int k = Integer.parseInt(token.nextToken());
		int front = 0;

		ArrayList<Integer> permu = new ArrayList<>();

		// 1부터 7까지 삽입
		for (int i = 1; i <= n; i++) {
			permu.add(i);
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k - 1; j++) {
				if (front >= permu.size()) // front가 남은 요소 개수보다 크거나 같다면
					front = 0; // 0으로 초기화

				if (front < permu.size() - 1) // front값이 남은 요소 개수보다 작으면
					front += 1; // front + 1
				else // front값이 남은 요소 개수보다 크면
					front = 0; // front가 0번째 인덱스를 가리키게 설정
			}

			sb.append(permu.get(front)); // front가 가리키는 값을 저장하고
			permu.remove(front); // front가 가리키는 값 지움

			if (permu.size() != 0) // 남은 요소 개수가 0이 아니라면
				sb.append(", "); // ", " 문자열 추가
		}

		sb.append(">");
		System.out.println(sb);
	}
}
