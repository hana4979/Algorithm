import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// https://st-lab.tistory.com/165
public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine()); // N! 입력받기
		int count_0 = 0; // 0의 개수

		// 5! = 120 / 9! = 362,880 / 10! = 3,628,800 / 15! = 1,307,674,368,000
		// n이 5씩 증가할수록 n / 5개의 0이 생김
		// + 입력값이 25일 때는 카운트 값이 2가 증가 --> 5의 n승에 따라 카운트 값 추가

		while (n >= 5) { // 더 이상 5로 나눠지지 않을 때까지 반복
			count_0 += n / 5;
			n /= 5;
		}

		System.out.println(count_0);
	}
}
