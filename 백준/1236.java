import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer token = new StringTokenizer(bf.readLine(), " ");

		int n = Integer.parseInt(token.nextToken()); // 성의 세로 크기
		int m = Integer.parseInt(token.nextToken()); // 성의 가로 크기

		char[][] castleGuard = new char[n][m];

		int rowGuardCount = 0; // 행에 필요한 경비원 수
		int colGuardCount = 0; // 열에 필요한 경비원 수

		// 배열에 값 저장하기 위한 for문
		for (int i = 0; i < n; i++) {
			String guardCheck = bf.readLine();
			boolean rowGuard = false; // 행(가로)에 경비원 확인

			// 배열에 값 저장 && 행에 경비원 수 확인
			for (int j = 0; j < m; j++) {
				castleGuard[i][j] = guardCheck.charAt(j);
				if (guardCheck.charAt(j) == 'X')
					rowGuard = true;

				// 마지막까지 돌았을 때 경비원이 없었다면
				if (j == m - 1 && rowGuard == false)
					rowGuardCount++;
			}
		}

		// 열에 경비원 수 확인을 위한 for문
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (castleGuard[j][i] == 'X')
					break;
				if (j == n - 1) // 마지막까지 돌았을 때 경비원('X')이 없었다면
					colGuardCount++;
			}
		}

		if (rowGuardCount >= colGuardCount)
			System.out.println(rowGuardCount);
		else
			System.out.println(colGuardCount);
	}
}