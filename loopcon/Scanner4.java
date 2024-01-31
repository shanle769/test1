package loopcon;
// 1. num1 : 정수
// 2. num2 : 정수
// 3. result = 계산기 결과
// 4. num3 = 숫자 0 : 종료, 1 : + , 2 : -
// 5.                       op = "+", result = num1 + num2
/*
결과
정수1 : 10
정수2 : 20
연산자 : 1 -> 내부 op = "-", switch 문
결과 : 10 - 20 = -10
 */

import java.util.Scanner;

public class Scanner4 {
  public static void main(String[] args) {
    int num1, num2, num3, op = 0;
    int result = 0;
    Scanner scanner = new Scanner ( System.in );
    while ( true ) {
      System.out.print("=== 계산기 ===");
      System.out.print("정수 1 : ");
      num1 = scanner.nextInt();
      System.out.print("정수 2 : ");
      num2 = scanner.nextInt();
      System.out.print(" 연산자 : 0 종료, 1 : +, 2 : -, 3 : *, 4 : /, 5 : % :");
      num3 = scanner.nextInt();
      switch( op ) {
        case 1 :
          result = num1 + num2;
      }
    }
  }
}
