package condition;
/*
문제1)
a = 10 , b = 20
max = 0
최대값 구하기
결과
최대값은 20입니다

방법 3가지
if
if ~ else
삼항
*/

// 삼항
public class Con2 {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int max = (a > b) ? a : b;
    System.out.println("최대값 : " + max);
  }
}


/*
단일 if
    if ( a > b ) {
      max = a ;
      // System.out.println("최대값 : " + a );
      System.out.println("최대값 : " + max );
    }

    if ( a < b ) {
      max = b ;
      System.out.println("최대값 : " + max );
    }
 */

/*
if ~ else
    if ( a > b ) {
      max = a ;
      // System.out.println("최대값 : " + a );
      System.out.println("최대값 : " + max );
    }else {
      max = b ;
      System.out.println("최대값 : " + max );
    }
 */