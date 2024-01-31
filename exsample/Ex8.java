package exsample;

import java.util.Scanner;

public class Ex8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int price, age, discount = 0;

    System.out.print("금액을 입력 : ");
    price = scanner.nextInt();
    System.out.print("나이를 입력 : ");
    age = scanner.nextInt();

    if (price >= 10000) {
      discount += 1000;
      System.out.println("10000원 이상 구매, 1000원 할인");
    }
    if (age <= 10) {
      discount += 1000;
      System.out.println("어린이 1000원 할인");
    }
    System.out.println("총 할인 금액 : " + discount + "원");
  }
}


/*
단일 if
    int price , age , discount = 0;
    price = 20000;
    age = 10;
    if ( price >= 10000 ) {
      discount += 1000;
      System.out.println("10000원 이상 구매, 1000원 할인");
    }
    //나이
    if ( age <= 10 ) {
      discount +=1000;
      System.out.println("어린이 1000원 할인");
    }
    System.out.println("총 할인 금액 : " + discount + "원");
*/