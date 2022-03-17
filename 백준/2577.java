import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int b = Integer.parseInt(bf.readLine());
		int c = Integer.parseInt(bf.readLine());

		int[] numArr = new int[10];
		int result = a * b * c;

		while (result != 0) { // 더 이상 나눠질 값이 없을 때까지
			numArr[result % 10]++;
			result /= 10;
		}

		for(int i = 0; i < numArr.length; i++)
			System.out.println(numArr[i]);
		
	}

}

// 1. 정수형 자릿수대로 자르기
// 2. 동시에 index 같은 배열 빈도수 증가
