import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int divCount = Integer.parseInt(bf.readLine());
		StringTokenizer token = new StringTokenizer(bf.readLine(), " ");
		// +++ 토큰 갯수가 divCount 와 같은지 확인

		ArrayList<Integer> divisorList = new ArrayList<Integer>();

		while (token.hasMoreTokens()) { // token 이 남아있다면
			divisorList.add(Integer.parseInt(token.nextToken())); // ArrayList 에 약수 값 저장
		}

		Collections.sort(divisorList); // 오름차순 정렬

		if (divisorList.size() == 1) // 진짜 약수가 1개라면
			System.out.println(divisorList.get(0) * divisorList.get(0));
		else // 진짜 약수가 2개 이상이라면
			System.out.println(divisorList.get(0) * divisorList.get(divCount - 1));
	}
}
