package exsample;

import java.util.Scanner;

public class Ex9 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int price, age, discount = 0;

    System.out.print("금액을 입력 : ");
    price = scanner.nextInt();
    System.out.print("나이를 입력 : ");
    age = scanner.nextInt();

    if( price >= 10000 && age <= 10) {
      discount += 2000;
      System.out.println("10000원 이상 구매, 1000원 할인");
      System.out.println("어린이 1000원 할인");
    }else if ( price >= 10000 || age <= 10 ) {
      discount += 1000;
      System.out.println("10000원 이상 구매 또는 어린이, 1000원 할인");
    }else {
      discount = 0;
      System.out.println("1000원 할인이 불가능");
    }
    System.out.println("총 할인 금액 : " + discount + "원");
  }
}





/*
    Scanner scanner = new Scanner(System.in);
    int price, age, discount = 0;

    System.out.print("금액을 입력 : ");
    price = scanner.nextInt();
    System.out.print("나이를 입력 : ");
    age = scanner.nextInt();

    if ( price >= 10000 ) {
      discount += 1000;
      System.out.println("10000원 이상 구매, 1000원 할인");
    }else if ( age <= 10 ) {
      discount += 1000;
      System.out.println("어린이 1000원 할인");
    }else {
      discount = 0;
      System.out.println("1000원 할인이 불가능");
    }
    System.out.println("총 할인 금액 : " + discount + "원");
*/