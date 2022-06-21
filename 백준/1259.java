import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(bf.readLine());
		
		int compareNum = 0; // 비교할 때 사용할 변수
		int count = 0; // 값이 같은 횟수를 저장하기 위한 변수
		
		do {
			// 입력받은 숫자 분해하기
			int numLength = (int) Math.log10(num) + 1; // 숫자 길이 구하기
			int n = numLength;
			int arr[] = new int[numLength];
			for (int i = 0; i < numLength; i++) {
				arr[i] = num / (int) (Math.pow(10, n - 1)); // 앞에서부터 한 숫자씩 떼어 배열에 저장
				num %= (int) (Math.pow(10, n - 1)); // 떼어낸 숫자 제거
				n--;
			}

			for(int i = 0; i < numLength / 2; i++) {
				compareNum = arr[numLength - i - 1];
				
				if(arr[i] == compareNum)
					count++;
			}
			
			if(count == numLength / 2) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
			
			count = 0; // count 초기화
			num = Integer.parseInt(bf.readLine());
			
		} while (num != 0);
	}
}