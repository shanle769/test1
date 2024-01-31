package condition;

public class If14 {
  public static void main(String[] args) {
    // 평점별로 추천 프로그램
    // 삼항 연산자
    // ( 조건 ) ? 참 : 거짓
    double rating = 6.3;
    // String result = ( rating <= 7 ) ? "수상한 세탁소" : "아쿠아맨";
    String result = ( rating <= 7 ) ? "수상한 세탁소" : ( rating <= 8 ) ? "아쿠아맨" : ( rating <= 9 ) ? " 서울의 봄" : "랜덤";
    System.out.println(result + " 추천");

  }
}



/*
if ~ else
public class If14 {
  public static void main(String[] args) {
    // 평점별로 추천 프로그램
    // if ~ else if 문 작은수부터 큰수로 진행 : 같은 성격을 비교할 경우에는
    // 단일 if문 다른 성격을 비교할 경우에는
    // 변수 >= 0 && 변수 <= 5 : 범위
    double rating = 7.3;
    if( rating <= 7 ) {
      System.out.println("수상한 세탁소 추천");
    }else if( rating <= 8 ) {
      System.out.println("아쿠아맨 추천");
    }else if( rating <= 9 ) {
      System.out.println("서울의 봄 추천");
    }else {
      System.out.println("랜덤 추천");
    }
  }
}
*/

/*
단일 if
public class If14 {
  public static void main(String[] args) {
    // 평점별로 추천 프로그램
    // if ~ else if 문 작은수부터 큰수로 진행 : 같은 성격을 비교할 경우에는
    // 단일 if문 다른 성격을 비교할 경우에는
    double rating = 6.1;
    if( rating <= 9 ) {
      System.out.println("서울의 봄 추천");
    }
    if( rating <= 8 ) {
      System.out.println("아쿠아맨 추천");
    }
    if( rating <= 7 ) {
      System.out.println("수상한 세탁소 추천");
    }
  }
}
*/