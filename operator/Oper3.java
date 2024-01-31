package operator;
// 대입 연산자
public class Oper3 {
  public static void main(String[] args) {
    int x, y;
    x = 10;
    y = 20;
    //x = x + y ;
    x += y;
    System.out.println("합 :" + x);
    //30-20

    //x = x - y;
    x -= y;
    System.out.println("차 :" + x);

    //x = x * y;
    x *= y;
    System.out.println("곱 :" + x);

    //x = x / y;
    x /= y;
    System.out.println("몫 :" + x);

    //x= x % y;
    x %= y;
    System.out.println("나머지 :" + x);

  }
}
