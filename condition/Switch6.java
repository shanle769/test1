package condition;

public class Switch6 {
  public static void main(String[] args) {
    int grade = 1;
    int coupon = switch (grade) {
      case 1 -> coupon = 3000;
      case 2,5 -> coupon = 2000;
      case 3,7 -> coupon = 1000;
      default -> coupon = 500;
    };
    System.out.println(grade + "등급 , 쿠폰 " + coupon);
  }
}






/*
public class Switch6 {
  public static void main(String[] args) {
    int x = 5;
    String result = switch (x) {
      case 1 -> "운동화" ;
      case 3 -> "화장품" ;
      case 5 -> "구두" ;
      case 9 -> "상품권" ;
      default -> "꽝 다음기회에" ;
    };
    System.out.println( result );
  }
}
*/
