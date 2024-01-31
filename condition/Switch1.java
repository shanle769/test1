package condition;

// switch ~ case : 조건 분기형 : 같다
// if : 조건식 관계, 논리 , 삼항연산자

/*
경품 추천
1 : 운동화
3 : 화장품
5 : 구두
9 : 상품권
그외 : 꽝 다음기회에

* 정수 x
* 결과5 - 1 : if 개수
*/

public class Switch1 {
  public static void main(String[] args) {
    int x = 5;
    String result;
    // String result = null;
    // String result = "";
    //조건 분기형 : 주로 같다
    // case1 => x==1

    switch (x) {
      case 1 : result = "운동화" ; break ;
      case 3 : result = "화장품" ; break ;
      case 5 : result = "구두" ; break ;
      case 9 : result = "상품권" ; break ;
      default: result = "꽝 다음기회에" ;
    }
    System.out.println( result );
  }
}
