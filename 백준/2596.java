import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static final String A = "000000";
	public static final String B = "001111";
	public static final String C = "010011";
	public static final String D = "011100";
	public static final String E = "100110";
	public static final String F = "101001";
	public static final String G = "110101";
	public static final String H = "111010";

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		String SecretLetter = bf.readLine();
		StringBuffer result = new StringBuffer();

		for (int i = 0; i < n; i++) {
			String SecretWord = SecretLetter.substring(i * 6, i * 6 + 6);

			if (SecretWord.equals(A) || wrongCheck(SecretWord, A)) {
				result.append("A");
			} else if (SecretWord.equals(B) || wrongCheck(SecretWord, B)) {
				result.append("B");
			} else if (SecretWord.equals(C) || wrongCheck(SecretWord, C)) {
				result.append("C");
			} else if (SecretWord.equals(D) || wrongCheck(SecretWord, D)) {
				result.append("D");
			} else if (SecretWord.equals(E) || wrongCheck(SecretWord, E)) {
				result.append("E");
			} else if (SecretWord.equals(F) || wrongCheck(SecretWord, F)) {
				result.append("F");
			} else if (SecretWord.equals(H) || wrongCheck(SecretWord, H)) {
				result.append("H");
			} else if (SecretWord.equals(G) || wrongCheck(SecretWord, G)) {
				result.append("G");
			}
		}
		
		System.out.print(result);
		// (추가) 모르는 문자가 있을 경우, 이것이 처음 나오는 위치 출력
	}

	public static boolean wrongCheck(String str, String alphabet) {
		int wrong = 0;

		for (int i = 0; i < 6; i++) {
			if (!(str.charAt(i) == alphabet.charAt(i))) { // 알파벳에 해당하는 비밀문자 비교 시 틀린 글자가 있다면
				wrong++; // wrong 변수 값 증가
			}
		}

		if (wrong >= 2)
			return false;
		else
			return true;
	}
}
