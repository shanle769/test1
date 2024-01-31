package operator;

// 형변환
public class Oper11 {
  public static void main(String[] args) {
    int x = (int) 3.14;
    System.out.println( x );

    // 큰타입은 작은타입을 넣을수 있다 자동 형변환
    // double y = 10/3;
    // double y = (double) 10/3; // 둘중에 하나만 형변환
    double y = 10/3.0; // 둘중에 하나만 형변환
    System.out.println( y );
  }
}
