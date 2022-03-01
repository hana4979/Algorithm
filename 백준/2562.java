import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int [] maxArr = new int[9];
		
		// 배열에 9개의 값 저장
		for(int i = 0; i < maxArr.length; i++) {
			maxArr[i] = Integer.parseInt(bf.readLine());
		}
		
		int max = maxArr[0];
		int countMax = 1; // 첫번째 큰 값이 나올 경우 대비
		
		for(int i = 1; i < maxArr.length; i++) {
			if(max < maxArr[i]) {
				max = maxArr[i];
				countMax = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.println(countMax);
		
	}
}