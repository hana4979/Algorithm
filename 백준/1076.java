import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String resistanceValue = "";
		
		for(int i = 1; i >= 0; i--) {
			String resistanceColor = bf.readLine();
			resistanceValue += colorValue(resistanceColor);
		}
		
		String resistanceColor = bf.readLine();
		// 저항의 곱 값만큼 String 형식의 0 붙여주기
		for(int howMany = 0 ; howMany < colorValue(resistanceColor); howMany++)
			resistanceValue += "0";
		System.out.println(resistanceValue);
	}
	
	// 색상에 따른 저항 or 곱 값
	public static int colorValue(String resColor) {
		int value = 0;
		switch(resColor) {
		case "black":
			value = 0;
			break;
		case "brown":
			value = 1;
			break;
		case "red":
			value = 2;
			break;
		case "orange":
			value = 3;
			break;
		case "yellow":
			value = 4;
			break;
		case "green":
			value = 5;
			break;
		case "blue":
			value = 6;
			break;
		case "violet":
			value = 7;
			break;
		case "grey":
			value = 8;
			break;
		case "white":
			value = 9;
			break;
		default:
			break;
		}
		return value;
	}
}

// 220524 저항 값 int형태로 거듭제곱 사용 + 곱 값 string "0" 붙임 --> 실패
// 처음부터 String 값으로 붙이기 --> 실패
// 21억이 넘어가는 값 어떻게 '계산'해 표현할지 생각
