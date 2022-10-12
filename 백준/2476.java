import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());

		ArrayList<Integer> result = new ArrayList<>(); // 결과를 저장할 ArrayList

		for (int i = 0; i < n; i++) {
			int[] dice = new int[6]; // 주사위 눈의 개수 파악할 배열
			int sameDiceNum = 0; // 같은 눈이 나온 숫자
			int sameCount = 1; // 같은 눈이 나온 횟수
			StringTokenizer token = new StringTokenizer(bf.readLine());

			for (int j = 0; j < 3; j++) { // 주사위에 눈이 나올 때마다 배열에 +1씩 저장
				int diceNum = Integer.parseInt(token.nextToken());
				dice[diceNum - 1]++; // 배열 저장을 위해 임의로 -1

				if (j == 2 && dice[diceNum - 1] == 3) { // 3개의 눈이 다 같으면
					sameDiceNum = diceNum;
					sameCount = 3;
				} else if (j >= 1 && dice[diceNum - 1] == 2) { // 2개의 눈이 같으면
					sameDiceNum = diceNum;
					sameCount = 2;
				}
			}

			// 상금 계산
			if (sameCount == 3) // 3개의 눈이 다 같으면
				result.add(10000 + sameDiceNum * 1000); // 10000 + (같은 눈) * 1000
			else if (sameCount == 2) // 2개의 눈이 같으면
				result.add(1000 + sameDiceNum * 100);
			else { // 모두 다 다른 눈이 나왔다면
				for (int j = 5; j > 0; j--) { // 6부터 1까지 돌리면서
					if (dice[j] == 1) { // 눈이 나온 흔적이 있다면
						sameDiceNum = j + 1; // 가장 큰 눈을 저장하고
						break; // 멈추기
					}
				}
				result.add(sameDiceNum * 100); // (가장 큰 눈) * 100
			}
		}

		Collections.sort(result, Collections.reverseOrder()); // 결과 내림차순 정렬 (정렬 후 뒤집기)
		System.out.println(result.get(0)); // 가장 높은 상금값 출력
	}
}

/*
눈을 하나하나 넣지 않고 token을 받은 뒤 정렬(ex. map) 후 첫번째와 마지막 눈을 비교해 같다면 3개의 눈이 같을 떄,
첫번째와 두번째 혹은 두번째와 세번째만 같다면 2개의 눈이 같을 때,
그 외엔 모두 다른 눈이 나오고, 가장 큰 눈은 세번째 있는 눈이다. 로 상금 계산해 출력하면 코드를 더 줄일 수 있음
*/