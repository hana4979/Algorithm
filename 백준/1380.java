import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		int studentCount = 0; // 귀걸이를 돌려받지 못한 학생 수 세기

		do {
			// 귀걸이 뺏긴 학생 정보를 담을 HashMap
			Map<Integer, String> student = new HashMap<Integer, String>();

			for (int i = 0; i < n; i++) {
				student.put(i + 1, bf.readLine()); // HashMap에 귀걸이 뺏긴 학생 이름 저장
			}

			int[] earring = new int[n];
			int studentNumber = 0;

			for (int i = 0; i < 2 * n - 1; i++) {
				StringTokenizer token = new StringTokenizer(bf.readLine(), " ");

				studentNumber = Integer.parseInt(token.nextToken());
				earring[studentNumber - 1] += token.nextToken().charAt(0);

				// 배열 값이 도합 131이 되면 HashMap에서 삭제
				// 'A' + 'B' = 65 + 66 = 131
				if (earring[studentNumber - 1] == 131) {
					student.remove(studentNumber);
				}
			}

			studentCount++;
			for (Map.Entry<Integer, String> entry : student.entrySet()) {
				System.out.println(studentCount + " " + entry.getValue());
			}

			n = Integer.parseInt(bf.readLine());
		} while (n != 0); // 입력에 0이 들어오면 반복문 종료

	}
}