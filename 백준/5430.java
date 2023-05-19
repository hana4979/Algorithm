import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
	public static List<String> lst;

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(bf.readLine()); // testcase

		while (t-- > 0) {

			lst = new ArrayList<String>();

			String p = bf.readLine(); // 수행할 함수
			int n = Integer.parseInt(bf.readLine()); // 배열에 들어있는 수의 개수
			String str = bf.readLine(); // [x1,..xn]과 같은 형태로 배열에 들어있는 정수
			changeList(str); // 배열에 값 추가하는 메소드

			System.out.println(lst); // lst 적용 확인용
			
			

		}
	}

	public static void changeList(String str) {
		char charValue = ' '; // char값 임시 저장
		String num = ""; // 정수값을 String형으로 임시 저장

		for (int i = 1; i < str.length(); i++) { // 처음과 마지막 괄호 제외
			charValue = str.charAt(i);

			if (charValue == 44 || i == str.length() - 1) { // 콤마가 왔거나 괄호 바로 전 숫자가 오면
				lst.add(num); // lst에 값 추가
				System.out.println(num);
				num = ""; // 초기화
			} else
				num += charValue; // 콤마가 아닐 경우 숫자 붙이기
		}
	}

}
