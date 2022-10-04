import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		
		int[] dropCard = new int[n - 1];
		ArrayList<Integer> card = new ArrayList<Integer>();
		
		int count = 0; // 몇 번 시도했는지
		
		for(int i = 1; i <= n; i++) { // 1부터 n까지 카드 세팅
			card.add(i);
		}
		
		while(card.size() > 1) { // 남은 카드의 수가 1일 때까지
			dropCard[count] = card.remove(0); // 첫번째 카드를 버린다
			card.add(card.remove(0)); // 맨 앞에 있는 카드를 뒤로 보낸다
			count++;
		}
		
		for(int i = 0; i < n - 1; i++) { // 바닥에 내려둔 카드 순서대로 출력
			System.out.print(dropCard[i] + " ");
		}
		System.out.print(card.get(0)); // 마지막 남은 카드 출력
		
	}
}
