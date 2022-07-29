import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Hashtable;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
   public static void main(String[] args) throws IOException {

      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

      Hashtable<Integer, Integer> score = new Hashtable<Integer, Integer>();
      int[] problem = new int[5]; //

      for (int i = 1; i <= 8; i++) {
         score.put(i, Integer.parseInt(bf.readLine()));
      }

      // 이게.. 통째로 이해가 안 됨. Hashtable 공부하기
      Collection cols = score.values();
      List<String> scoreList = new ArrayList<String>(cols);
      // Hashtable 의 value 값 내림차순 정렬
      Collections.sort(scoreList, Collections.reverseOrder());

      // (참고) key를 이용한 정렬 : Collections.sort에 넣어서 key정렬 후 사용
      
      int sumScore = 0;
      for (int i = 1; i <= 5; i++) {
         sumScore += cols.getKey(i); // vlalue값만 빼오는 방법? 어떻게 불러와..?
         // scoreList.getKey() --> The method getKey(int) is undefined for the type List<String>
         // score.getKey() --> The method getKey(int) is undefined for the type Hashtable<Integer,Integer>
         // cols.getKey() --> The method getKey(int) is undefined for the type Hashtable<Integer,Integer>
         
         
         // 배열에 key값 저장하고 후에 오름차순 정렬하기
         // problem[i] = score.getKey(i);
      }

      System.out.println(sumScore);
      for (int i = 0; i < problem.length; i++) {
         System.out.print(problem[i] + " ");
      }
   }
}