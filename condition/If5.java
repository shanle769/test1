package condition;
// 단일 if문
/*
num = 0
양수입니다.
음수입니다.
0 입니다.
*/
public class If5 {
  public static void main(String[] args) {
    int num = 0;
    if ( num > 0 ) {
      System.out.println("양수");
    }
    if ( num < 0 ) {
      System.out.println("음수");
    }
    if ( num == 0 ) {
      System.out.println("0입니다.");
    }
  }
}
/*
  수업이 끝나고 친구를 만나면 저녁먹기
  if ( 친구를 만나면 ) {
     저녁먹기
  }
  결과 2개 참 / 거짓
  수업이 끝나고
    친구를 만나면 저녁먹기
     그렇지 않으면 집에간다
   if ( 친구를 만나면 ) {
      저녁먹기
    }else {
     집에간다
    }
*/