import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int diagonal = 1; // 몇 번째 대각선인지 세기
		int countNum = 1; // 몇 번째 함수인지 세기
		int inputNum = input.nextInt(); // 입력받은 값(몇번째 함수 호출할 것인지)
		int repeat = 1; // 반복횟수
		
		//분수관련 변수들
		int top = 1; // 분자
		int bottom = 1; // 분모
		
		while(countNum != inputNum) {
			if(diagonal % 2 == 0) { // 대각선이 짝수이면
				top += 1;
				if(bottom != 1) bottom -= 1; // 분모가 1이면 수행하지 않음
				countNum++;
				if(top-1 == diagonal) diagonal ++; // 분모가 대각선 값과 같아지면 대각선 값 증가
			}else { // 대각선이 홀수이면
				if(top != 1) top -= 1; // 분자가 1이면 수행하지 않음
				bottom += 1;
				countNum++;
				if(bottom-1 == diagonal) diagonal ++; // 분자가 대각선 값과 같아지면 대각선 값 증가
			}
		}
        System.out.println(top + "/" + bottom);
    }

// https://st-lab.tistory.com/74
// 참고사항 : 대각선 값 변수로 두기

// 단축 방법 하나 : BufferedReader사용
// 단축 방법 둘 : 직전 대각선 합, 대각선 값, 입력받은 값 총 3가지 변수만으로 규칙 찾기 가능.

}