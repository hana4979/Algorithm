import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int startHour = scan.nextInt();
		int startMin = scan.nextInt();
		
		int endHour = 0;
		int endMin = scan.nextInt();
		
		// 1차 : 입력 받은 값 60을 기준으로 시간, 분 더하기
		if(endMin >= 60) { // 입력받은 값이 60이 넘으면(1시간 이상)
			endHour = (endMin / 60) + startHour; // 시작 시간 + 입력받은 시간 
			endMin = (endMin % 60) + startMin; // 시작 분 + 입력받은 분
		} else { // 입력받은 값이 60이 되지 않는다면(1시간 미만)
			endHour = startHour;
			endMin += startMin; // 시작 분 + 입력받은 분
		}
		
		// 2차 : endMin 60을 기준으로 시간 더하기
		if(endMin >= 60) {
			endMin -= 60;
			endHour += 1;
		}
		
		// 3차 : endHour이 24이상일 경우
		if(endHour >= 24) {
			endHour -= 24;
		}
		
		System.out.println(endHour + " " + endMin);
			
	}
}