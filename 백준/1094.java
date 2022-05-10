import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int want = Integer.parseInt(bf.readLine()); // 만들고자 하는 막대기 길이
		int stick = 64; // 64cm의 막대기
		int sumStick = 0;
		int count = 0;

		while (sumStick != want) {

			if (want == 64) {
				count++;
				break; // 만들고자 하는 막대기가 입력받은 값인 64인 경우
			}
			
			stick /= 2; // 가장 짧은 막대기를 절반으로 자른다
			if (sumStick + stick <= want) { // 자르고 남은 막대기를 더한 값이 want보다 작거나 같다면
				sumStick += stick; // 반을 더한다
				count++;
			}
			
			if(sumStick + stick <= want && sumStick + stick != 64) { // 남은 막대기가 원하는 길이가 아니라면
				sumStick += stick;
				count++;
			}
		}

		System.out.println(count);
	}
}