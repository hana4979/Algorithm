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

		int tip_result = 0; // 총 팁
		for (int i = 0; i < customer; i++) {
			int tip = tipList.get(i) - (i + 1 - 1); // 원래 주려고 생각했던 돈 - (받은 등수 - 1)
			if (tip > 0) // tip이 양수라면(음수가 아니라면)
				tip_result += tip; // 받을 수 있다
		}

		System.out.println(tip_result);
	}
}