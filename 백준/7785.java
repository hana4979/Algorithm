import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		HashMap<String, String> commute = new HashMap<>();
		StringTokenizer token;

		int n = Integer.parseInt(bf.readLine());

		String name = ""; // 직원 이름
		String state = ""; // 직원 출퇴근 여부

		for (int i = 0; i < n; i++) {
			token = new StringTokenizer(bf.readLine(), " ");

			name = token.nextToken();
			state = token.nextToken();

			if (state.equals("leave")) { // 퇴근 상태라면
				if (commute.containsKey(name))// key에 이름이 있을 때
					commute.remove(name); // name과 같은 key값의 자료를 삭제
				// commute.values().remove(value); 하면 값을 기준으로 삭제할 수 있음

			} else { // 출근 상태라면
				if (!(commute.containsKey(name))) // key에 이름이 없을 때
					commute.put(name, state); // HashMap에 직원 자료 추가
			}
		}

		ArrayList<String> keySet = new ArrayList<>(commute.keySet());

		Collections.reverse(keySet); // key 역순 정렬

		for (String key : keySet) {
			System.out.println(key);
		}
	}
}

// 상태 확인 후, HashMap에 key 유무에 따라 값을 넣다 뺐다 했으나 여전히 실패. 반례를 못 찾음.
// HashSet으로 name만 받는 걸로 다시 풀기
