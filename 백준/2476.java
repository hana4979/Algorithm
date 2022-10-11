import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());

		for (int i = 0; i < n; i++) {
			int[] dice = new int[6]; // 주사위 눈의 개수 파악할 배열
			int same = 1; // 같은 눈이 나온 횟수
			StringTokenizer token = new StringTokenizer(bf.readLine());
			ArrayList<Integer> result = new ArrayList<>(); // 결과를 저장할 ArrayList

			for (int j = 0; j < 3; j++) { // 주사위에 눈이 나올 때마다 배열에 +1씩 저장
				int diceNum = Integer.parseInt(token.nextToken());
				dice[diceNum]++;

				if (j == 3 && dice[diceNum] == 3) // 3개의 눈이 다 같으면
					same = 3;
				else if (j >= 2 && dice[diceNum] == 2) // 2개의 눈이 같으면
					same = 2;
			}

		}

	}
}
