import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int customer = Integer.parseInt(bf.readLine()); // 손님 수
		ArrayList<Integer> tipList = new ArrayList<Integer>(); // 손님이 주신 팁 저장할 리스트

		for (int i = 0; i < customer; i++) {
			tipList.add(Integer.parseInt(bf.readLine()));
		}

		Collections.sort(tipList); // 오름차순 정렬
		Collections.reverse(tipList); // 역순으로 정렬 == 내림차순 정렬

		long tip_result = 0; // 등수 <= 100,000 , 팁 <= 100,000
		for (int i = 0; i < customer; i++) {
			if (tipList.get(i) - i <= 0) // 내림차순 된 tip 값에서 등수를 뺏을 떄 0 이하라면
				break; // 반복문 종료

			tip_result += tipList.get(i) - (i + 1 - 1); // 원래 주려고 생각했던 돈 - (받은 등수 - 1)
		}

		System.out.println(tip_result);
	}
}