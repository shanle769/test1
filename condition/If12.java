package condition;
// 다중 if문
/*
0 ~ 7세 : 미취학
8 ~ 13 : 초등학생
14 ~ 16 : 중학생
17 ~ 19 : 고등학생
20이상 : 성인
*/

public class If12 {
  public static void main(String[] args) {
    int age = 20;
    String result ;
    if ( age <= 7 ) {
      result ="미취학";
    }else if ( age >= 8 && age <= 13 ) {
      result ="초등학생";
    }else if ( age >= 14 && age <= 16 ) {
      result ="중학생";
    }else if ( age >= 17 && age <= 19 ) {
      result ="고등학생";
    }else {
      result ="성인";
    }
    System.out.println("결과 : " + result);
  }
}

/*
    int age = 20;
    if ( age <= 7 ) {
      System.out.println("미취학");
    }else if ( age <= 13 ) {
      System.out.println("초등학생");
    }else if ( age <= 16 ) {
      System.out.println("중학생");
    }else if ( age <= 19 ) {
      System.out.println("고등학생");
    }else {
      System.out.println("성인");
    }
 */