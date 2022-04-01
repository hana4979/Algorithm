import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class Main {
   public static void main(String[] args) throws IOException {
      
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      String input = bf.readLine();
      
      // 방법 1. charAt()
      Character[] charatArr = new Character[input.length()]; // Wrapper 클래스로 
      
      for(int i = 0; i < input.length(); i++) {
    	  charatArr[i] = input.charAt(i);
      }
      
      Arrays.sort(charatArr, Collections.reverseOrder());
      
      for(int i : charatArr)
         System.out.print(i -'0');
      
      System.out.println();
      
      
      // 방법 2. split()
      String[] strArr = input.split(""); // split는 String을 자름
      Integer[] splitArr = new Integer[strArr.length];
      
      for(int i = 0; i < splitArr.length; i++) {
    	  // 래핑은 인자에 String을 써야 함
    	  splitArr[i] = Integer.parseInt(strArr[i]); // 형변환
      }
      
      Arrays.sort(splitArr, Collections.reverseOrder());
      
      for(int i : splitArr)
          System.out.print(i);
      
   }
}