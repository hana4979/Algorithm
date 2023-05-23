import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Deque;

public class Main {
	public static Deque<String> dq;
	public static boolean isError = false;
	public static boolean isReverse = false;

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;

		int t = Integer.parseInt(bf.readLine()); // testcase

		while (t-- > 0) {

			dq = new LinkedList<String>();
			sb = new StringBuilder();
			isError = false;
			isReverse = false;

			String p = bf.readLine(); // 수행할 함수
			int n = Integer.parseInt(bf.readLine()); // 배열에 들어있는 수의 개수
			String str = bf.readLine(); // [x1,..xn]과 같은 형태로 배열에 들어있는 정수
			changeDeque(str); // 덱에 값 추가하는 메소드

			for (int i = 0; i < p.length(); i++) {
				if (p.charAt(i) == 'D') { // 버리기 함수 'D'
					if (dq.isEmpty()) {
						isError = true;
						break;

					} else if (!isReverse) { // 뒤집은 상태가 아니라면
						dq.pollFirst(); // 맨 앞의 값 제거
						n--;

					} else { // 뒤집은 상태라면
						dq.pollLast(); // 맨 뒤의 값 제거
						n--;

					}

				} else if (p.charAt(i) == 'R') { // 뒤집기 함수 'R'
					if (isReverse)
						isReverse = false;
					else
						isReverse = true;

				}
			}

			// 결과값 출력
			if (isError == true) {
				sb.append("error");

			} else if (!isReverse) { // 뒤집은 상태가 아니라면
				for (int i = 0; i < n; i++) {
					if (i == 0)
						sb.append("[");

					sb.append(dq.pollFirst()).append(",");

					if (i == n - 1) {
						sb.deleteCharAt(sb.length() - 1); // 마지막문자 , 제거
						sb.append("]");
					}
				}

			} else { // 뒤집은 상태라면
				for (int i = 0; i < n; i++) {
					if (i == 0)
						sb.append("[");

					sb.append(dq.pollLast()).append(",");

					if (i == n - 1) {
						sb.deleteCharAt(sb.length() - 1); // 마지막문자 , 제거
						sb.append("]");

					}

				}
			}

			System.out.println(sb);

		}

	}

	public static void changeDeque(String str) {
		char charValue = ' '; // char값 임시 저장
		String num = ""; // 정수값을 String형으로 임시 저장

		for (int i = 1; i < str.length(); i++) { // 처음과 마지막 괄호 제외
			charValue = str.charAt(i);

			if (charValue == 44 || i == str.length() - 1) { // 콤마가 왔거나 괄호 바로 전 숫자가 오면
				dq.add(num); // dq에 값 추가
				num = ""; // 초기화

			} else
				num += charValue; // 콤마가 아닐 경우 숫자 붙이기

		}
	}

}

// 230523 빈 배열이 입력되었을 때 error가 출력되지 않음