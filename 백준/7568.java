import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		HashMap<Integer, Integer> size = new HashMap<Integer, Integer>();

		int n = Integer.parseInt(bf.readLine());

		for (int i = 0; i < n; i++) {
			StringTokenizer token = new StringTokenizer(bf.readLine(), " ");
			size.put(Integer.parseInt(token.nextToken()), Integer.parseInt(token.nextToken()));
		}

		// 덩치 비교(해야됨)
		int weight = size.getValue(0);
		int ranking = 1;
		for (int i = 1; i < n; i++) {
			if (weight <= size.getValue(i))
				;

		}

	}
}