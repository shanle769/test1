package condition;
// if ~ else
// num 정수가 양수,0 이다, 음수
public class If8 {
  public static void main(String[] args) {
    int num = 0 ;
  //  if ( num >= 0) {
    if ( num > 0 || num == 0 ) {
      System.out.println("양수 또는 0이다");
    }else {
      System.out.println("음수");
    }
  }
}

// num 정수가 양수, 음수
/*
* int num = -6 ;
    if ( num > 0) {
      System.out.println("양수");
    }else {
      System.out.println("음수");
    }
* */