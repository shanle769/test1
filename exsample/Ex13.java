package exsample;

import java.util.Scanner;

public class Ex13 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String name = "", hak = "";
    int kor = 0, eng = 0, mat = 0, sum = 0;
    double avg = 0.0;

    System.out.print("이름 : ");
    name = scanner.nextLine();
    System.out.print("국어 : ");
    kor = scanner.nextInt();
    System.out.print("영어 : ");
    eng = scanner.nextInt();
    System.out.print("수학 : ");
    mat = scanner.nextInt();

    sum = kor + eng + mat ;
    avg = sum / 3.0 ;
    // avg = (double) sum / 3 ;

    if( avg >= 90 ) {
      hak = "A";
    }else if ( avg >= 80 ) {
      hak = "B";
    }else if ( avg >= 70 ) {
      hak = "C";
    }else if ( avg >= 60 ) {
      hak = "D";
    }else {
      hak = "F";
    }
    System.out.println(name + "의 총점은 " + sum + "이고 평균은 " + avg + "이며 학점은 " + hak + " 입니다.");
  }
}
