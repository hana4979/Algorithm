import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static int[] stack;
	public static int size = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int K = Integer.parseInt(bf.readLine());
		int num;

		stack = new int[K];

		while (K-- > 0) {
			num = Integer.parseInt(bf.readLine());

			checkZero(num);
		}

		int sum = 0;
		for (int i : stack) {
			sum += i;
		}

		System.out.println(sum);
	}

	public static void checkZero(int num) {
		if (num == 0) { // 0을 입력 받았다면
			stack[--size] = 0; // 가장 마지막으로 입력받은 숫자를 삭제
		} else {
			stack[size++] = num;
		}
	}
}
