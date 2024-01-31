package loopcon;

import java.util.Scanner;

public class Scanner2 {
  public static void main(String[] args) {
    int num1, num2, sum = 0;
    Scanner scanner = new Scanner ( System.in );
    System.out.print("정수 1 : ");
    num1 = scanner.nextInt();
    System.out.print("정수 2 : ");
    num2 = scanner.nextInt();
    sum = num1 + num2;
    System.out.print("두 수의 합 : " + sum);
  }
}
