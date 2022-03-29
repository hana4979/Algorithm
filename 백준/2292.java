import java.util.*;

public class Main {

	public static void main(String[] args) {
		// 방 하나를 지날 때마다 (+6*i)씩 늘어남
		
		Scanner input = new Scanner(System.in);
		
		int roomNum = 1; // 방의 갯수
		int inputNum = input.nextInt(); // 방 번호 입력받기
		
		for(int n = 1; ; n++ ) {
			if(inputNum == 1) {
				System.out.println(1);
				break;
			}else if(roomNum + 1 <= inputNum && inputNum <= roomNum + (6*n)){ // 입력 받은 값이 범위내에 있다면
				System.out.println(n+1);
				break;
			}
			roomNum += (6*n); // if문이 끝날 때마다 roomNum 재정의
		}
	}
}