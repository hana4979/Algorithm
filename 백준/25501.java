import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	// f = first , l = last
	public static int[] recursion(String word, int f, int l, int count) {
		count++; // 재귀 반복 횟수에 따라 증가
		if (f >= l) // 문자열이 팰린드롬 이라면
			return new int[] { 1, count }; // 팰린드롬 여부와 함수 반복 횟수를 배열로 리턴
		else if (word.charAt(f) != word.charAt(l)) // 글자가 달라 해당 문자열이 팰린드롬이 아니라면
			return new int[] { 0, count };
		else
			return recursion(word, f + 1, l - 1, count); // 가장자리 글자부터 순차적으로 비교
	}

	public static int[] isPalindrome(String word) {
		int howManyRecursion = 0; // 재귀함수 반복 횟수
		// 첫번째 인덱스와 마지막 인덱스를 보냄
		return recursion(word, 0, word.length() - 1, howManyRecursion);
	}

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine()); // 몇개의 글자를 비교할 것인지

		for (int i = 0; i < n; i++) {
			String word = bf.readLine();
			int[] result = isPalindrome(word); // 배열 입력 받기
			System.out.println(result[0] + " " + result[1]);
		}
	}
}
