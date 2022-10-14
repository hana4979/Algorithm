import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int firstColor = colorValue(bf.readLine()); // 입력받은 색깔을 숫자로 변환해 입력받기
		int secondColor = colorValue(bf.readLine());
		int thirdColor = colorValue(bf.readLine());

		System.out.println((long) ((firstColor * 10 + secondColor) * Math.pow(10, thirdColor)));
	}

	// 색상에 따른 저항 or 곱 값
	public static int colorValue(String resColor) {
		int value = 0;
		switch (resColor) {
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