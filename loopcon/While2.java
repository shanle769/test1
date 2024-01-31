package loopcon;

public class While2 {
  public static void main(String[] args) {
    int x = 0 , sum = 0 ;
    while ( x <= 30 ) {
      if ( x % 2 == 0 ) {
        sum += x;
      }
      x++;
    }
    System.out.println("짝수의 총합 : " + sum);
  }
}
