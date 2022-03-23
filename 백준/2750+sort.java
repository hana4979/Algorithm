import java.util.Arrays;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		Integer arr[] = new Integer[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(bf.readLine());
		
		// 오름차순 (Arrays.sort())
		Arrays.sort(arr);
		System.out.print("오름차순 : ");
		for(int i : arr)
			System.out.print(" " + i);
		
		// 내림차순 (Collections 클래스의 reverseOrder())
		// 기본 타입의 배열을 래퍼클래스로 바꿔줘야 함
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.print("\n" + "내림차순 : ");
		for(int i : arr)
			System.out.print(" " + i);
	}
}

