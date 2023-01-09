import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int series = Integer.parseInt(bf.readLine());
		int count = 1; // 첫번째 시리즈
		int num = 666; // 시리즈의 시작인 666

		while (count != series) {
			int check_number6 = 0; // 6이 나왔을 때 체크
			int digitNum = (int) Math.log10(num) + 1; // 자릿수 체크
			for (int i = 0; i <= (int) Math.log10(num) + 1; i++) {
				if (num % 10 * digitNum == '6') { // 각 자리수에 6이 나오면
					check_number6++;
					digitNum--;
					if (check_number6 == 3) { // 6이 연속 3번 나왔다면
						count++;
						break; // for문 종료
					}
				} else {
					check_number6 = 0;
				}

				num++;
			}

			System.out.println(num);
		}

	}
}