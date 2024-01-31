package operator;

/* 이름 , 국어점수, 영어점수, 수학점수의
합계와 평균 구하기 */
// name, kor, eng, mat, sub, avg
// name : 문자열, kor : 정수, eng : 정수, mat : 정수, sub : 정수, avg : 실수
// 이름 : 홍길동
// 국어점수 : 90
// 영어점수 : 80
// 수학점수 : 70
// 세과목 총점 : 240
// 세과목 평균 : 80.0

public class Oper7 {
  public static void main(String[] args) {
    String name;
    int kor, eng, mat, sum;
    double avg;

    name = "홍길동";
    kor = 90;
    eng = 80;
    mat = 70;
    sum = kor + eng + mat;
    avg = sum / 3.0;

    System.out.println("이름 : " +name );
    System.out.println("국어점수 : " +kor );
    System.out.println("영어점수 : " +eng );
    System.out.println("수학점수 : " +mat );
    System.out.println("세과목 총점 : " +sum );
    System.out.println("세과목 평균 : " +avg );

  }
}
