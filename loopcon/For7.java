package loopcon;

import java.util.Scanner;

public class For7 {
  public static void main(String[] args) {
    // dan , result
    // 단 키보드 입력받기
    Scanner scanner = new Scanner(System.in);
    int dan = 0, result = 0 ;

    System.out.print("단 : ");
    dan = scanner.nextInt();

    for(int i = 1 ; i <= 9 ; i++) {
      result = dan * i;
      System.out.println(dan + " X " + i + " = " + result );
    }
  }
}


/*
 2단
 2 X 1 = 2
 2 X 2 = 4
 ...
 2 X 9 = 18
*/