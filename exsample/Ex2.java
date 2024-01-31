package exsample;

// for 문
public class Ex2 {
  public static void main(String[] args) {
    // 1부터 20까지의 합구하기
    int sum = 0, len = 20 ;
    for ( int i = 1 ; i <= len ; i++ ) {
      sum += i ; // sum = sum + i
      //  System.out.println("sum : " + sum );
    } // end for
    System.out.println("sum : " + sum );
  } // end main
} // end class


/*
public class Ex2 {
  public static void main(String[] args) {
    for (int i = 1, num = 2 ; i <= 10 ; i++, num +=2 ) {
      System.out.print( " , " + i + "/ num : " + num);
    } // end for
  } // end main
} // end class
*/