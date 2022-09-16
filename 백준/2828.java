import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer token = new StringTokenizer(bf.readLine());
		int screenSize = Integer.parseInt(token.nextToken()); // 스크린 N칸
		int basketSize = Integer.parseInt(token.nextToken()); // 바구니 M칸
		int howManyApples = Integer.parseInt(bf.readLine()); // 떨어지는 사과 개수
		int move = 0; // basket의 이동거리

		int[] basket = new int[basketSize];
		for (int i = 0; i < basketSize; i++) { // basket이 차지하는 screen칸 초기설정
			basket[i] = i + 1; // 왼쪽에서부터 basketSize칸
		}

		for (int i = 0; i < howManyApples; i++) {
			int dropApple = Integer.parseInt(bf.readLine());

			while (!check(basket, dropApple)) { // basket이 떨어지는 사과 위치에 없다면
				// basket을 오른쪽 혹은 왼쪽으로 한 칸 이동

			}

		}

		System.out.println(move);
	}

	public static boolean check(int[] basket, int apple) {
		for (int i = 0; i < basket.length; i++) {
			if (basket[i] == apple) // basket이 떨어지는 사과 위치에 있다면
				return true;
		}

		return false; // basket이 떨어지는 사과 위치에 없다면
	}
}
