import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int repeat = Integer.parseInt(bf.readLine());
		String file = bf.readLine();
		char[] fileCompare = new char[file.length()];

		// 배열에 첫번째로 입력받은 값 넣기
		for (int i = 0; i < file.length(); i++) {
			fileCompare[i] = file.charAt(i);
		}

		for (int i = 0; i < repeat - 1; i++) {

			file = bf.readLine();

			for (int j = 0; j < file.length(); j++) {
				if (fileCompare[j] != file.charAt(j)) { // 첫번째 글자와 비교했을 때 값이 같지 않다면
					fileCompare[j] = 63; // "?" 물음표 넣기
				}
			}
		}

		for (int i = 0; i < fileCompare.length; i++)
			System.out.print(fileCompare[i]);

	}
}