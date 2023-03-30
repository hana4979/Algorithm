import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer token;

		int n = Integer.parseInt(bf.readLine());

		Queue<Integer> queue = new LinkedList<>();
		int queueSize = 0;
		int last = 0; // 마지막으로 입력된 변수 저장

		for (int i = 0; i < n; i++) {
			token = new StringTokenizer(bf.readLine(), " ");

			switch (token.nextToken()) {
			case "push":
				last = Integer.parseInt(token.nextToken()); // 마지막에 push된 값 저장 위함
				queue.offer(last); // queue에 데이터 추가
				queueSize++; // 데이터 추가 후 사이즈 증가
				break;

			case "pop":
				if (queueSize == 0) // queue가 비었다면
					sb.append(-1).append('\n');
				else {
					sb.append(queue.poll()).append('\n'); // queue의 첫번째 값을 반환하고 삭제
					queueSize--; // 데이터 삭제 후 사이즈 감소
				}
				break;

			case "size":
				sb.append(queue.size()).append('\n');
				break;

			case "empty":
				if (queueSize == 0) // 큐가 비었다면
					sb.append(1).append('\n');
				else
					sb.append(0).append('\n');
				break;

			case "front":
				if (queueSize == 0)
					sb.append(-1).append('\n');
				else
					sb.append(queue.peek()).append('\n'); // queue의 첫번째 값 반환
				break;

			case "back":
				if (queueSize == 0)
					sb.append(-1).append('\n');
				else
					sb.append(last).append('\n');
				break;

			}
		}

		System.out.println(sb);
	}
}
