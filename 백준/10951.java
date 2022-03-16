import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		
		while((str = bf.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println(a + b);
		}

	}
}

// 220316 1316 틀린 이유를 도저히 모르겠어서 처음부터 다시 풀어보는 걸로, 오늘은 End Of File 배우기 ^_____^