// 핵심 : 식을 정리하라

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// A만원의 고정비용, B만원의 가변비용
		// 생산시 A * (n * B) (n은 생산 개수)
		// 노트북 C만원 가격 책정

		Scanner input = new Scanner(System.in);

		int fixedCost = input.nextInt(); // 고정비용
		int variableExpense = input.nextInt(); // 가변비용
		int price = input.nextInt(); // 책정가격

			// 가변비용이 책정가격보다 높을 경우 순익분기점 발생 불가
			if (variableExpense >= price) {
				System.out.println("-1");
			} else {
				// 고정비용 + (가변비용*개수) <= 책정가격 * 개수 --> 순익분기점 발생
				// 우리가 구하고자 하는 것 개수(i) --> i로 식 정리!
				// 개수(i) >= 고정비용 / 책정가격 - 가변비용
				System.out.println(fixedCost / (price - variableExpense)+1);
				
		}
	}
}