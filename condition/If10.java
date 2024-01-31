package condition;
// num : ?
// 5의 배수이다 그렇지않으면 5의 배수가 아니다
public class If10 {
  public static void main(String[] args) {
    int num = 35;
    if ( num % 5 == 0 ) {
      System.out.println("5의 배수이다.");
    }else {
      System.out.println("5의 배수가 아니다.");
    }
  }
}
