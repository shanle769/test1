package condition;
    /*
    변수 선언 정수형 : 초기값 선언 하는것이 좋다
    지비 : 처음 실행 모두 처리한 후 실행 에러의 경우의 수가 없어야 한다.

    * 회원 등급 쿠폰을 발급
    * 회원 등급 ( 1 , 2 , 3 => grade)
    * 쿠폰 : coupon
    * 1등급 : 쿠폰 3000원
    * 2등급 : 쿠폰 2000원
    * 3등급 : 쿠폰 1000원
    * 그외
    * 500원
    * */

public class Switch2 {
  public static void main(String[] args) {
    // if문 조건 관계, 비교 + 산술등 - true/false
    // ~ 같다 : 분기형 switch ~ case문 처리가속도 빠르다
    int coupon, grade = 3;
    switch (grade) { // switch ( 변수 )
      case 1: // grade가 1과 같으면, if( grade == 1 )
        coupon = 3000;
        break;
      case 2: case 5: // if( grade == 2 || grade == 5 )
        coupon = 2000;
        break;
      case 3: case 7:
        coupon = 1000;
        break;
      default:
        coupon = 500;
    }
    System.out.println(grade + "등급 , 쿠폰 " + coupon);
  }
}




/*
    int coupon, grade = 4;
    if (grade == 1) {
      coupon = 3000;
    } else if (grade == 2) {
      coupon = 2000;
    } else if (grade == 3) {
      coupon = 1000;
    } else {
      coupon = 500;
    }
    if (grade >= 1 && grade <= 3) {
      System.out.println(grade + "등급 / 쿠폰발급 : " + coupon + "원");
    } else {
      System.out.println("해당 등급은 쿠폰 : " + coupon + "원");
    }
  }
}
*/