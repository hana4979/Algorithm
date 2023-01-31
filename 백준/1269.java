import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer token = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(token.nextToken());
		int b = Integer.parseInt(token.nextToken());

		HashSet<String> aSet = new HashSet<>(); // 집합 A
		StringTokenizer aToken = new StringTokenizer(bf.readLine());
		for (int i = 0; i < a; i++) {
			aSet.add(aToken.nextToken());
		}

		HashSet<String> bSet = new HashSet<>(); // 집합 B
		StringTokenizer bToken = new StringTokenizer(bf.readLine());
		for (int i = 0; i < b; i++) {
			bSet.add(bToken.nextToken());
		}

		System.out.println(difference(aSet, bSet) + difference(bSet, aSet));
	}

	public static int difference(HashSet<String> mainSet, HashSet<String> subSet) {
		int count = mainSet.size();
		// subSet의 모든 원소를 꺼내기 위한 Iterator
		Iterator iter = subSet.iterator();
		while (iter.hasNext()) {
			Object obj = iter.next();
			if (mainSet.contains(obj)) // mainSet에 해당 원소가 있다면
				count--; // 원소 갯수 하나 감소
		}

		return count;
	}
}
