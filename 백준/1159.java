import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		boolean playerOk = false;
		int n = Integer.parseInt(bf.readLine());
		int[] firstname = new int[26];
		String name = "";

		for (int i = 0; i < n; i++) {
			name = bf.readLine();
			firstname[name.charAt(0) - 97]++;
		}

		for (int i = 0; i < firstname.length; i++) {
			if (firstname[i] >= 5) {
				System.out.print((char) (i + 97));
				if (playerOk == false)
					playerOk = true;
			}
		}

		if (playerOk == false)
			System.out.println("PREDAJA");
	}
}