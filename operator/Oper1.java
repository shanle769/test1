package operator;

//1. 산술연산자 +,-,*,/,%
public class Oper1 {
  public static void main(String[] args) {
    int x , y ;
    int sum , sub , mul , div , mod ;

    x = 30;
    y = 4 ;

    sum = x + y ;
    sub = x - y ;
    mul = x * y ;
    div = x / y ; // x/0 => 0으로 나눌수 없다
    mod = x % y ; // int % int => int
    // double mod = (double) x % y => 둘중에 하나를 형변환
    // double avg = (double) sum / 3
    // double avg = sum / 3.0

    System.out.println("합 : " + sum); // 합 : 34
    System.out.println("차 : " + sub);
    System.out.println("곱 : " + mul);
    System.out.println("몫 : " + div);
    System.out.println("나머지 : " + mod);


  }
}
