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
			
			ys += (value / 29) * 10;
			if(value % 29 != 0) ys += 10;
			
			ms += (value / 59) * 15;
			if(value % 59 != 0) ms += 15;
		}
		
		if(ms > ys)
			System.out.print("Y" + " " + ys);
		else if(ys == ms)
			System.out.println("Y" + " " + "M" + " " + ys);
		else
			System.out.print("M" + " " + ms);
	}
}

// 220512 논리 오류