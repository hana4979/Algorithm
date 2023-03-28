import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer token;

		int n = Integer.parseInt(bf.readLine());

		ArrayList<Integer> queueList = new ArrayList<Integer>(); // list의 맨 앞에서 값이 삭제가 일어남에 따라 자동으로 당겨짐
		int queueSize = 0;

		for (int i = 0; i < n; i++) {
			token = new StringTokenizer(bf.readLine(), " ");

			switch (token.nextToken()) {
			case "push":
				queueList.add(Integer.parseInt(token.nextToken())); // queue(List)에 데이터 추가
				queueSize++;
				break;

			case "pop":
				if (queueSize == 0) // queue(List)가 비었다면
					sb.append(-1).append('\n');
				else {
					sb.append(queueList.remove(0)).append('\n'); // queue의 맨 앞의 값을 빼고 출력
					queueSize--;
				}
				break;

			case "size":
				sb.append(queueSize).append('\n');
				break;

			case "empty":
				if (queueSize == 0)
					sb.append(1).append('\n');
				else
					sb.append(0).append('\n');
				break;

			case "front":
				if (queueSize == 0)
					sb.append(-1).append('\n');
				else
					sb.append(queueList.get(0)).append('\n');
				break;

			case "back":
				if (queueSize == 0)
					sb.append(-1).append('\n');
				else
					sb.append(queueList.get(queueSize - 1)).append('\n');
				break;

			}
		}

		System.out.println(sb);
	}
}

// 230328 시간 초과 발생