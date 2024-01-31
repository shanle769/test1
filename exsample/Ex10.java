package exsample;

import java.util.Scanner;

public class Ex10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int score = 0;
    String hak = "";
    System.out.print("점수를 입력하세요 : ");
    score = scanner.nextInt();

    if (score >= 90) {
      hak = "A";
    } else if (score >= 80) {
      hak = "B";
    } else if (score >= 70) {
      hak = "C";
    } else if (score >= 60) {
      hak = "D";
    } else {
      hak = "F";
    }
    System.out.println("학점은 " + hak +"입니다.");
  }
}


/*
    int score = 0;
    System.out.print("점수를 입력하세요 : ");
    score = scanner.nextInt();

    if (score >= 90 ) {
      System.out.println("학점은 A입니다.");
    }else if ( score >= 80 ) {
      System.out.println("학점은 B입니다.");
    }else if ( score >= 70 ) {
      System.out.println("학점은 C입니다.");
    }else if ( score >= 60 ) {
      System.out.println("학점은 D입니다.");
    }else {
      System.out.println("학점은 F입니다.");
    }
 */