package exsample;

// 단일 if 문
import java.util.Scanner;

public class Ex20 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int money = 0, num = 0, inMoney = 0, outMoney = 0;

    while (true) {
      System.out.println("------------------------------");
      System.out.println("1.예금 2.출금 3.잔고 4.종료");
      System.out.println("------------------------------");
      System.out.print("선택> ");
      num = scanner.nextInt();

      if (num == 1) {
        System.out.print("예금액> ");
        inMoney = scanner.nextInt();
        money += inMoney;
      } else if (num == 2) {
        System.out.print("출금액> ");
        outMoney = scanner.nextInt();
        // if 양수, 양수 - 음수 : 대출
        money -= outMoney;
      } else if (num == 3) {
        System.out.println("잔고> " + money + "원");
      } else if (num == 4) {
        System.out.println("은행 프로그램 종료");
        break;
      } else {
        System.out.println("선택범위 초과 다시 입력하세요.");
      }
    } // end while
  }
}



/*
    int money = 0, num = 0, inMoney = 0, outMoney = 0 ;

    while ( true ) {
      System.out.println("------------------------------");
      System.out.println("1.예금 2.출금 3.잔고 4.종료");
      System.out.println("------------------------------");
      System.out.print("선택> ");
      num = scanner.nextInt();

      if( num == 1 ) {
        System.out.print("예금액> ");
        inMoney = scanner.nextInt();
        money += inMoney ;
      }
      if( num == 2) {
        System.out.print("출금액> ");
        outMoney = scanner.nextInt();
        // if 양수, 양수 - 음수 : 대출
        money -= outMoney ;
      }
      if( num == 3 ) {
        System.out.println("잔고> " + money + "원");
      }
      if( num == 4 ) {
        System.out.println("은행 프로그램 종료");
        break;
      }
      if (num >= 4 ) {
        System.out.println("선택범위 초과 다시 입력하세요.");
      }
    } // end while
*/