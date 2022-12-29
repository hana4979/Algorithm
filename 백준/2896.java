import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer ration = new StringTokenizer(bf.readLine());
		float[] need = new float[3]; // 필요한 비율
		for (int i = 0; i < 3; i++) {
			need[i] = Float.parseFloat(ration.nextToken());
		}

		StringTokenizer amount = new StringTokenizer(bf.readLine());
		float[] have = new float[3]; // 가지고 있는 양
		for (int i = 0; i < 3; i++) {
			have[i] = Float.parseFloat(amount.nextToken());
		}

		// 각각 가지고 있는 양으로 만들 수 있는 잔의 개수 중 가장 적은 값을 glass로 저장
		float glass = (need[0] / have[0]) > (need[1] / have[1]) ? (need[1] / have[1]) : (need[0] / have[0]);
		glass = glass > (need[2] / have[2]) ? (need[2] / have[2]) : glass;

		for (int i = 0; i < 3; i++) {
			System.out.print(need[i] - (have[i] * glass) + " ");
		}
	}
}