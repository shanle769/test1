package condition;
// if ~ else
// 정수 num의 결과 짝수 , 홀수
public class If9 {
  public static void main(String[] args) {
    int num = 40 ;
    if ( num % 2 == 0 ) { // num이 2로 나눈 나머지가 0이면 짝수 그렇지 않으면 홀수
      System.out.println("짝수");
    }else {
      System.out.println("홀수");
    }
  }
}
