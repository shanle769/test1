package exsample;

import java.util.Scanner;

public class Ex6 {
  public static void main(String[] args) {
    int max = 0, sum = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.print("정수를 입력 : ");
    max = scanner.nextInt();
    for (int i = 0; i <= max; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    } // end for
    System.out.println("총 짝수의 합은 : " + sum);
  }
}
