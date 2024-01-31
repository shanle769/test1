package condition;

public class Switch3 {
  public static void main(String[] args) {
    int  month = 14;
    String result = ""; // result = null;
    switch ( month ) {
      case 3: case 4: case 5:
        result = "봄"; break;
      case 6,7,8:
        result = "여름"; break;
      case 9: case 10: case 11:
        result = "가을"; break;
      case 12: case 1: case 2:
        result = "겨울"; break;
      default:
        System.out.println("해당월은 존재 하지 않습니다.");
    }
    if( month >=1 && month <=12 ) {
      System.out.println(month + "월은 " + result);
    }
  }
}




/*
public class Switch3 {
  public static void main(String[] args) {
    int  month = 12;
    String result = "";
    if ( month == 3 || month == 4 || month == 5 ) {
      result = "봄";
    }else if( month == 6 || month == 7 || month == 8) {
      result = "여름";
    }else if( month == 9 || month == 10 || month == 11) {
      result = "가을";
    }else if( month == 12 || month == 1 || month == 2) {
      result = "겨울";
    }else {
      System.out.println("해당월은 존재하지않음");;
    }
   if ( month >=1 && month <= 12 ) {
     System.out.println(month + "월의 계절은 " + result + "입니다");
      }
  }
}
 */