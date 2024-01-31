package exsample;

import java.util.Scanner;

public class Ex7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String foodName = "";
    int foodPrice = 0, foodQuantity =0, foodTotal = 0 ;

    System.out.print("음식명 : ");
    foodName = scanner.nextLine();
    System.out.print("음식가격 : ");
    foodPrice = scanner.nextInt();
    System.out.print("음식수량 : ");
    foodQuantity = scanner.nextInt();
    foodTotal = foodPrice * foodQuantity;
    System.out.println("-------------------------------");
    System.out.println("주문음식 : " + foodName);
    System.out.println("주문수량 : " + foodQuantity + "개");
    System.out.println("주문 총 금액 : " + foodTotal + "원");
  }
}
