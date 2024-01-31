package condition;
// if ~ else
public class If13 {
  public static void main(String[] args) {
    int age = 16;
    String addr = "인천";
    if ( age >= 16 && addr.equals("인천")) {
      System.out.println("가입 가능");
    }else {
      System.out.println("가입 불가능");
    }
  }
}
