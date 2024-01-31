package exsample;

import java.util.Scanner;

public class Ex17 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num1 = 0, num2 = 0, num3 = 0, result = 0;
    String op = "";
    System.out.println("계산기 만들기");
    System.out.println("-------------------------");

    while (true) {
      System.out.print("첫번째 정수 : ");
      num1 = scanner.nextInt();
      System.out.print("두번째 정수 : ");
      num2 = scanner.nextInt();
      System.out.print("연산자 선택  : 종료 : end , +, -, *, /, %");
      System.out.println();
      System.out.print("선택  : ");

      scanner.nextLine();
      op = scanner.nextLine();

      if (op.equals("end")) {
        System.out.println("계산기 프로그램 종료");
        break;
      } // end if
      switch (op) {
        case "+":
          result = num1 + num2;
          break;
        case "-":
          result = num1 - num2;
          break;
        case "*":
          result = num1 * num2;
          break;
        case "/":
          result = num1 / num2;
          break;
        case "%":
          result = num1 % num2;
          break;
        default:
          System.out.println("잘못된 연산자 입니다.");
      } // end switch
      if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("%"))
        System.out.println("결과 : " + num1 + op + num2 + " = " + result);
    } // end if
  }
}
