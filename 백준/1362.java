import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int scenario = 0; // 시나리오는 1번부터

		do {
			StringTokenizer weightToken = new StringTokenizer(bf.readLine());

			int properWeight = Integer.parseInt(weightToken.nextToken()); // 적정 체중
			int nowWeight = Integer.parseInt(weightToken.nextToken()); // 실제 체중

			if (properWeight == 0 && nowWeight == 0)
				break;

			String button = ""; // 운동 or 먹이 or "#" (종료)
			int number = 0; // 체중 변화량

			// "# 0" 이 입력될 때까지 시나리오 반복
			do {
				StringTokenizer statusToken = new StringTokenizer(bf.readLine());

				button = statusToken.nextToken();
				number = Integer.parseInt(statusToken.nextToken());

				if (button.equals("F")) {
					nowWeight += number;
				} else if (button.equals("E")) {
					nowWeight -= number;
				}
			} while (!(button.equals("#") && number == 0));

			scenario++;

			if (nowWeight > (properWeight / 2) && nowWeight < (properWeight * 2))
				System.out.println(scenario + " " + ":-)");
			else if (nowWeight <= 0)
				System.out.println(scenario + " " + "RIP");
			else {
				System.out.println(scenario + " " + ":-(");
			}

		} while (true);

	}
}
