import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String str = bf.readLine();

		do {
			String arr[] = str.split("");

			for (int i = 0; i < arr.length; i++) {
				if (i <= arr.length / 2) {
					if (!arr[i].equals(arr[arr.length - i - 1])) {
						System.out.println("no");
						break;
					}
				} else {
					System.out.println("yes");
					break;
				}
			}
			str = bf.readLine();
		} while (!(str.equals("0")));

	}
}

// 배열에 int를 담는 방식으로 다시 시도해보기