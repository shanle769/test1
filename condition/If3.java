package condition;
// 단일 if문
/*
0 ~ 7세 : 미취학
8 ~ 13 : 초등학생
14 ~ 16 : 중학생
17 ~ 19 : 고등학생
20이상 : 성인
*/

public class If3 {
  public static void main(String[] args) {
    int age = 10;
        if ( age <= 7 ) {
          System.out.println("미취학");
        } //end if
        if ( age <= 13 ) {
          System.out.println("초등학생");
        } //end if
        if ( age <= 16 ) {
          System.out.println("중학생");
        } //end if
        if ( age <= 19 ) {
          System.out.println("고등학생");
        } //end if
        if ( age >= 20 ) {
          System.out.println("성인");
        } //end if

  }
}

/*
public class If3 {
  public static void main(String[] args) {
    int age = 18;
        if ( age >= 0 && age <= 7 ) {
          System.out.println("미취학");
        } //end if
        if ( age >= 8 && age <= 13 ) {
          System.out.println("초등학생");
        } //end if
        if ( age >= 14 && age <= 16 ) {
          System.out.println("중학생");
        } //end if
        if ( age >= 17 && age <= 19 ) {
          System.out.println("고등학생");
        } //end if
        if ( age >= 20 ) {
          System.out.println("성인");
        } //end if

  }
}
* */
