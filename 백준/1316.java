import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
   public static void main(String[] args) throws IOException{
      
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      
      int n = Integer.parseInt(bf.readLine()); // 단어의 개수
      char[] alphabet = new char[26]; // 알파벳 빈도수 체크할 배열
      int count = 0; // 각 문자가 연속해서 나타나는 단어의 수 (그룹 단어)
      
      for(int i = 0; i < n; i++) {
         String str = bf.readLine();
         char[] wordArr = str.toCharArray();
         
         for(int j = 0; j < wordArr.length; j++) {
        	 int idx = wordArr[j] - 97;
        	 
        	 // 한 번 이상 나왔으며 && 직전에 나오지 않은 알파벳
        	 if(alphabet[idx] == 1 && idx != wordArr[j-1] - 97)
        		 break;
        	 
         }
         
      }

      // 26 알파벳 배열 만들기 --> 단어 빈도수 체크 --> 빈도 체크 시 1이상인 경우 for탈출, 카운트X
      // 단, 연달아 나오는 경우는 제외
   }
}