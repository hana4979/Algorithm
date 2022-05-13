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
			
			// /30 = 0 / 1 / 2 / 3 ... 에 따라 가격이 일정하게 정해짐
			ys += ((value / 30) + 1) * 10;
			
			ms += ((value / 60) + 1) * 15;
		}
		
		if(ms > ys)
			System.out.print("Y" + " " + ys);
		else if(ys == ms)
			System.out.println("Y" + " " + "M" + " " + ys);
		else
			System.out.print("M" + " " + ms);
	}
}