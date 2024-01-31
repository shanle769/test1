package condition;
// 다중 if문
/*
경품 추천
1 : 운동화
3 : 화장품
5 : 구두
9 : 상품권
그외 : 꽝 다음기회에

* 정수 x
* 결과5 - 1 : if 개수
* */

public class If11 {
  public static void main(String[] args) {
    int x = 9;
    if ( x == 1 ) {
      System.out.println("운동화");
    }else if ( x == 3 ) {
      System.out.println("화장품");
    }else if ( x == 5 ) {
      System.out.println("구두");
    }else if ( x == 9 ) {
      System.out.println("상품권");
    }else {
      System.out.println("꽝 다음기회에");
    }
  }
}
/*
3. 다중 if문 : if문 여러개 - 결과 여러개일때
    동일한 형식의 결과 2개 이상일때
    if ( 조건 ) 필수
     결과 -1 : if문 개수

     if( 조건식1 ) {
        참결과1
     }else if ( 조건식2 ) {
        참결과2
     }else if
     ...
     else {
        그외 결과
     }
*/