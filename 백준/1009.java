import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(bf.readLine());

		for (int i = 0; i < testcase; i++) {
			String dataInput = bf.readLine();
			StringTokenizer token = new StringTokenizer(dataInput, " ");

			int a = Integer.parseInt(token.nextToken());
			// 1부터 10까지 (전체적으로 봤을 때) 4번씩 같은 숫자 패턴이 나옴
			// b 값이 0이 나오면 무조건 1을 배출하기 때문에 + 4 (주기4)
			int b = Integer.parseInt(token.nextToken()) % 4 + 4;

			// data 갯수
			int data = 1;
			for (int j = 0; j < b; j++) {
				data = data * a % 10; // 컴퓨터 10대
			}

			// 매 값마다 %10을 해주지 않으면 틀린값 처리됨
			// int data = (int)Math.pow(a, b) % 10; --> 불가능

			// 10번째 컴퓨터가 처리해야할 데이터
			if (data == 0)
				data = 10;

			System.out.println(data);
		}
	}
}