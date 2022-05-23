import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int resistanceValue = 0;
		
		for(int i = 1; i >= 0; i--) {
			String resistanceColor = bf.readLine();
			resistanceValue += colorValue(resistanceColor) * Math.pow(10, i);
		}
		
		String resistanceColor = bf.readLine();
		resistanceValue *= Math.pow(10, colorValue(resistanceColor));
		
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

// 220523 white * 3 의 경우 int 최댓값을 넘어감 --> String으로 붙이기?