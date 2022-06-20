import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
   public static void main(String[] args) throws IOException {

      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

      int num = Integer.parseInt(bf.readLine());

      do {
         // 입력받은 숫자 분해하기
         int numLength = (int) Math.log10(num) + 1; // 숫자 길이 구하기
         int n = numLength;
         int arr[] = new int[numLength];
         for (int i = 0; i < numLength; i++) {
            arr[i] = num / (int) (Math.pow(10, n - 1)); // 앞에서부터 한 숫자씩 떼어 배열에 저장
            num %= (int) (Math.pow(10, n - 1)); // 떼어낸 숫자 제거
            n--;
         }
         
         
         if (arr.length == 1) { // 배열 길이 1인 경우 무조건 팰린드롬수
            System.out.println("yes");
         } else {
            // 팰린드롬수 확인
            for (int i = 0; i < arr.length; i++) {
               if (i <= arr.length / 2) {
                  if (arr[i] != arr[arr.length - i - 1]) {
                     System.out.println("no");
                     break;
                  }
               } else {
                  System.out.println("yes");
                  break;
               }
            }
            num = Integer.parseInt(bf.readLine());
         }
      } while (num != 0);
   }
}

// 발견한 오류
// 한 자리 입력시 값 출력 후 즉시 종료
// 같은 숫자로 된 두자리 수 무한루프