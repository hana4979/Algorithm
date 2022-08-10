import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.TreeMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		// 부모 키값과 비교해서 키 값이 낮은 것을 왼쪽 자식 노드에, 키값이 높은 것은 오른쪽 자식 노드에 저장
		// 키는 저장과 동시에 자동 오름차순으로 정렬
		TreeMap<Integer, String> membership = new TreeMap<>();

		int n = Integer.parseInt(bf.readLine());

		for (int i = 0; i < n; i++) {
			StringTokenizer token = new StringTokenizer(bf.readLine());

			// TreeMap에 회원정보 기입 (나이 --> key , 이름 --> value)
			membership.put(Integer.parseInt(token.nextToken()), token.nextToken());
		}

		// * entrySet() / keySey() 사용 불가 --> key값(=나이)이 같을 수 있음
		/*
		 * System.out.println(key + " " + value); });
		 */

	}
}
