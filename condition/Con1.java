package condition;

// 삼항연산자
// 형식 : (조건) ? 참결과 : 거짓결과
// if ~ else

public class Con1 {
  public static void main(String[] args) {
    int age = 25;
    String result = ( age >= 18 ) ? "성년" : "미성년" ;
    System.out.println( result );

    int x = 3 ; // 짝수, 홀수
    String result1 = ( x % 2 == 0 ) ? "짝수" : "홀수" ;
    System.out.println( result1 );


    int score = 85 ; // 합격, 불합격
    String result2 = ( score >= 80 ) ? "합격" : "불합격" ;
    System.out.println( result2 );
   }
}
