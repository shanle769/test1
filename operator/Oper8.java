package operator;

public class Oper8 {
  public static void main(String[] args) {
    String name = "홍길동";
    int kor = 100 , eng = 80 , mat = 98;
    int sum = 0;
    double avg = 0.0;

    //재할당
    sum = kor + eng + mat;
    avg = (double) sum/3.0;

    //출력
    System.out.println("이름 :" + name);
    System.out.println("국어점수 :" + kor);
    System.out.println("영어점수 :" + eng);
    System.out.println("수학점수 :" + mat);
    System.out.println("총점 :" + sum);
    System.out.println("평균 :" + avg);
  }
}
