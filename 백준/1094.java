import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int want = Integer.parseInt(bf.readLine()); // 만들고자 하는 막대기 길이
		int stick = 64; // 64cm의 막대기
		int sumStick = 0;
		int count = 1;
		
		while(sumStick != want) {
			stick /= 2; // 1. 가장 짧은 막대기를 절반으로 자른다
			sumStick += stick;
			if(stick >= want) // 2. 자르고 남은 막대기가 want 보다 길거나 같다면
				sumStick -= stick; // 2-1. 반은 버려버린다
			count++;
		}
		
		System.out.println(count);
	}
}

// 220503 sumStick + stick 을 해야 조건에 부합하는 경우, sumStick 만으로 조건이 부합되는 경우, 아예 while을 빠져나오지 못 하는 경우 3가지 존재 --> 알고리즘 재분석 