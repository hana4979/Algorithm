import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int series = Integer.parseInt(bf.readLine());
		int count = 0; // 시리즈
		int num = 666; // 시리즈의 시작인 666

		while (count != series) {
			// contains() 메소드 : 특정 문자열이 포함되어 있는지 확인
			if ((String.valueOf(num)).contains("666")) // 문자열로 변환한 숫자에 666이 있다면
				count++; // count값을 증가시킨다

			num++; // 하나하나씩 비교하기 위함
		}

		System.out.println(num - 1);
	}
}