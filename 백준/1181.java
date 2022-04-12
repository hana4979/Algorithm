import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

class strArr{
	
}

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		
		// 문제 1. char 로 받으면 string 을 변환해 넣을 방법이 없음
		// 문제 2. 구조체 형태로 받고 싶은데 배열 크기를 n만큼 지정 못 하겠음, 크기 지정한다 해도 배열을 어떻게 불러오지?
		String[] strArr = new String[n];
		int[] lenArr = new int[n];
		
		for(int i = 0; i < n; i++) {
			strArr[i] = bf.readLine();
			lenArr[i] = strArr[i].length();
		}
		
		//문제 3. 일단 따로따로 해보려 했는데 생각해보니 글자크기만으로는 무슨 글자인지 불러올 수가 없다
		Arrays.sort(lenArr); // 글자크기 순 배열
		Arrays.sort(strArr); // 사전 순 배열
		
		for(String i : strArr) {
			System.out.println(i);
		}

	}
}

// 220412 클래스로 한 번 시도해보기
