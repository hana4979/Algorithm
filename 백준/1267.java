import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int countCall = Integer.parseInt(bf.readLine());
		StringTokenizer timeCall = new StringTokenizer(bf.readLine(), " ");
		
		int ys = 0; // 영식 요금제
		int ms = 0; // 민식 요금제
		
		for(int i = 0; i < countCall; i++) {
			int value = Integer.parseInt(timeCall.nextToken());
			
			ys = (value / 30) * 10;
			if(value % 30 != 0) ys += 10;
			
			ms = (value / 60) * 15;
			if(value % 60 != 0) ms += 15;
		}
		
		if(ys >= ms)
			System.out.print("Y" + ys);
		else
			System.out.print("M" + ms);
	}
}

// 220511 널부러진 식 깔끔하게 정리하고 마무리하기