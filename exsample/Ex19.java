package exsample;

import java.util.Scanner;

public class Ex19 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] korScores;
    korScores = new int[5] ;
    int sum= 0 ;
    double avg = 0.0;
    // 평균은 실수형으로 수정

    // 입력 korScores.length
    for (int i = 0; i < korScores.length ; i++) {
      System.out.print("학생 "+(i+1)+"번의 국어 : ");
      korScores[i] = scanner.nextInt();
      sum += korScores[i];
    }
    //출력 korScores.length
    // for ( int i =0 ; i < 5 ; i++ ) {
    for ( int i = 0 ; i < korScores.length ; i++ ) {
      // sum +=  korScores[i];
      System.out.println("korScores["+i+"] : " + korScores[i]);
    }
    // 학생 x명의 국어점수 합은 xx 이고 반 국어점수 평균은 xx 입니다.
    // 평균도 정수값으로 => 마지막에 출력
    avg = (double) sum / korScores.length;
    System.out.println("학생 "+korScores.length+"명의 국어점수 합은 "+ sum +"이고 반 국어점수평균은 " + avg +"입니다.");
  }
}
