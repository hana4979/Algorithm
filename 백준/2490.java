import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 3; i++) {
			int[] checkYut = new int[2];
			StringTokenizer token = new StringTokenizer(bf.readLine(), " ");

			while (token.hasMoreTokens()) {
				checkYut[Integer.parseInt(token.nextToken())]++;
			}

			int bae = checkYut[0]; // 배(0) 갯수 저장
			String yut = "";
			switch (bae) {
			case 0:
				yut = "E"; // 모
				break;
			case 1:
				yut = "A"; // 도
				break;
			case 2:
				yut = "B"; // 개
				break;
			case 3:
				yut = "C"; // 걸
				break;
			case 4:
				yut = "D"; // 윷
				break;
			default:
				break;
			}

			System.out.println(yut);
		}
	}
}