import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine()); // 단어의 개수
		int count = 0; // 각 문자가 연속해서 나타나는 단어의 수 (그룹 단어)

		for (int i = 0; i < n; i++) {
			String str = bf.readLine();
			char[] wordArr = str.toCharArray();
			char[] alphabet = new char[26]; // 알파벳 빈도수 체크할 배열

			for (int j = 0; j < wordArr.length; j++) {
				int idx = wordArr[j] - 97;

				if (alphabet[idx] >= 1) { // 한 번 이상 나왔으며
					if (j == 0) { // 첫 글자라면
						alphabet[idx] += 1; // 빈도수 증가
						if (j == wordArr.length - 1)
							count++;
					} else if (idx != wordArr[j - 1] - 97) // 직전에 나온 알파벳이 아니라면
						continue;
					else {
						alphabet[idx] += 1;
						if (j == wordArr.length - 1)
							count++;
					}
				} else if (j == wordArr.length - 1) { // j가 단어 길이만큼 돌았다면
					count++; // 단어로 인정
				} else {
					alphabet[idx] += 1; // 빈도수 증가
				}
			}
		}

		System.out.println(count);

	}
}

//26 알파벳 배열 만들기 --> 단어 빈도수 체크 --> 빈도 체크 시 1이상인 경우 for탈출, 카운트X
// 단, 연달아 나오는 경우는 제외 / 첫 글자인 경우 제외

// 220315 틀렸습니다 이유 모르겠음..
