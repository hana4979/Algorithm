import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] mushroomPoint = new int[10];
		int point = 0;

		for (int i = 0; i < 10; i++) {
			mushroomPoint[i] = Integer.parseInt(bf.readLine());
		}

		int index = 0;
		do {
			point += mushroomPoint[index];

			// mushroomPoint를 더한 값이 100에 더 멀다면
			if (((point - 100) > (100 - (point - mushroomPoint[index]))) ? true : false) {
				point -= mushroomPoint[index]; // mushroomPoint 더하기 직전 값이 100에 가까움
				break;
			}

			index++;

		} while (index < 10);

		System.out.println(point);

	}
}
