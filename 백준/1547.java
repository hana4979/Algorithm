import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		int ball = 1; // 공의 위치(몇번 컵에 있는지)

		for (int i = 0; i < n; i++) {
			StringTokenizer token = new StringTokenizer(bf.readLine(), " ");

			int cup1 = Integer.parseInt(token.nextToken());
			int cup2 = Integer.parseInt(token.nextToken());
			// 위치 바꿀 컵 둘 중 하나에 공이 들어있는 경우
			if (cup1 == ball)
				ball = cup2; // 공 위치 바꾸기
			else if (cup2 == ball)
				ball = cup1;
		}
		
		System.out.println(ball);

	}
}