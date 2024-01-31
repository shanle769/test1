package exsample;

import java.util.Scanner;

// 1. 정수를 키보드로 받기
// nextlnt : 공백전까지 정수를 찾기
// 2. 입력받은 값이 짝수, 홀수
// 3. 결과 : 입력한 정수 30은 짝수
public class Ex5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in) ;
    int num = 0;
    System.out.print("정수를 입력 : ");
    num = scanner.nextInt();
    if (num % 2 == 0 ) {
      System.out.println("결과 : 입력한 정수 " + num + "는 짝수");
    }else {
      System.out.println("결과 : 입력한 정수 " + num + "는 홀수");
    }
  }
}
