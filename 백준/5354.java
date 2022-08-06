import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());

		while (n != 0) {
			int boxSize = Integer.parseInt(bf.readLine());

			for (int i = 1; i <= boxSize; i++) {
				for (int j = 1; j <= boxSize; j++) {
					if ((i == 1 || i == boxSize) || (j == 1 || j == boxSize)) {
						System.out.print("#");
					} else {
						System.out.print("J");
					}
				}
				System.out.println();
			}

			System.out.println(); // 상자마자 띄어쓰기
			n--;
		}
	}
}
