import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		int[] firstname = new int[26];
		int[] copyFirstname = new int[26];
		String name = "";

		for (int i = 0; i < n; i++) {
			name = bf.readLine();
			firstname[name.charAt(0) - 97]++;
			copyFirstname[name.charAt(0) - 97]++;
		}

		// 배열 정렬
		Arrays.sort(copyFirstname);
		int max = copyFirstname[copyFirstname.length - 1]; // 최댓값 저장

		if (max < 5)
			System.out.println("PREDAJA");
		else {
			for (int i = 0; i < firstname.length; i++) {
				if (firstname[i] == max)
					System.out.print((char)(i + 97));
			}
		}
	}
}