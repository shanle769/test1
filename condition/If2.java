package condition;
// 단일 if문
// 나이(age)가 20이상이면 성인
// 나이(age)가 18미만이면 미성년
public class If2 {
  public static void main(String[] args) {
    int age = 15;
    if ( age >= 20 ) {
      System.out.println("성인");
    } // end if
    if ( age < 18 ) {
      System.out.println("미성년");
    } // end if
  }
}
