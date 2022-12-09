import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine()); // 생성자를 찾을 자연수
		boolean hasM = false; // 생성자를 가지고 있는지 확인

		// 0부터 n까지 한 번씩 확인
		// 생성자 = n + (n의 각 자리 숫자 합)
		for (int i = 0; i <= n; i++) {
			int result = i; // 생성자 계산 결과 값
			int m = i; // 생성자인지 확인할 수
			// while 문으로 정리 + 작은 자릿수부터 뽑아온다면 시간 단축 가능(굳이 Math.pow() 쓸 필요 X)
			while (m > 0) {
				result += (m % 10); // m의 가장 작은 자릿수부터 result에 저장
				m /= 10; // 그 다음으로 작은 자릿수 불러오기
			}
			/*
			 * for (int j = (int) Math.log10(m) + 1; j >= 0; j--) {
				if (result > n) // result가 n의 값을 넘는다면
					break; // 중지
				result += (m / (Math.pow(10, j))); // m의 가장 큰 자릿수부터 result에 저장
				m %= (Math.pow(10, j)); // 그 다음으로 큰 m의 자릿수 불러오기
			}
			 */
			if (result == n) { // result 결과가 n 이라면
				System.out.println(i); // result는 n의 생성자
				hasM = true;
				break; // 값이 구해지면 for문 멈춤(제일 작은 수 구함)
			}
		}

		if (hasM == false)
			System.out.println(0);
	}
}

// (참고) 생성자 구하는 함수를 만들고 해당 값이 1보다 크다(==생성자가 존재한다)면 그대로 출력, 그렇지 않다면 0을 출력하는 코드를 만들 수도 있음