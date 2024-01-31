package loopcon;
/*
 * 1 ~ 100까지
 * 10단위로 끊어서 출력
 * */

public class For3 {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      System.out.print(i + " ");
      if ( i % 10 == 0 ) {
        System.out.println();
      } // end if
    } // end for
    System.out.println("/////////////////////////");

    for( char ch = 'a' ; ch <= 'z' ; ch++ ) {
      System.out.print( ch + ", ");
    }
  }
}
