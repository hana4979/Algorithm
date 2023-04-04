import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.HashSet;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		HashSet<String> commute = new HashSet<>();
		StringTokenizer token;

		int n = Integer.parseInt(bf.readLine());

		String name = ""; // 직원 이름
		String state = ""; // 직원 출퇴근 여부

		for (int i = 0; i < n; i++) {
			token = new StringTokenizer(bf.readLine(), " ");

			name = token.nextToken();
			state = token.nextToken();

			if (state.equals("enter")) // 출근 처리
				commute.add(name);

			else if (state.equals("leave")) { // 퇴근 처리
				if (commute.contains(name)) { // 해당 직원의 이름이 이미 있다면 (= 출근 상태라면)
					commute.remove(name); // 이름 제거 (= 퇴근처리)
				}
			}
		}

		ArrayList<String> list = new ArrayList<>(commute);

		// Collections.reverse(list); // 리스트를 역순으로 정렬 후 수정
		Collections.sort(list, Collections.reverseOrder()); // 리스트를 정렬 후 역순으로 된 새로운 리스트를 반환

		for (String l : list) {
			System.out.println(l);
		}
	}
}

// 상태 확인 후, HashMap에 key 유무에 따라 값을 넣다 뺐다 했으나 여전히 실패. 반례를 못 찾음.
// HashSet으로 name만 받는 걸로 다시 풀기
// Collections.reverse() 가 단순히 요소를 뒤집는다고 하기엔 결과값이 Collections.sort()와 다르지 않음
// chatGPT에 따르면 결과값은 같으나 확실하게 내림차순으로 정렬하고 출력하는 것이 더 정확하므로, 정확도의 문제라고 한다.
