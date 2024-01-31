package condition;
// 31일 => 1,3,5,7,8,10,12
// 30일 => 4,6,9,11
// 29일 => 2



public class Switch4 {
  public static void main(String[] args) {
    int month = 2;
    int day = 0;
    switch (month) {
      case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        day = 31; break;
      case 4: case 6: case 9: case 11:
        day = 30; break;
      case 2:
        day = 29; break;
      default:
        System.out.println("해당월은 존재하지 않습니다.");
    }
    if ( month >=1 && month <=12 ) {
      System.out.println(month + "월은 " + day +"일까지 입니다.");
    }
  }
}

/*
public class Switch4 {
  public static void main(String[] args) {
    int month = 2;
    int day = 0;
    if( month ==1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
      day = 31;
    }else if( month == 4 || month == 6 || month == 9 || month == 11) {
      day = 30;
    }else if( month == 2) {
      day = 29;
    }else {
      System.out.println("해당월은 존재하지 않습니다.");
    }
    if( month >=1 && month <=12 ) {
      System.out.println(month + "월은 " + day +"일까지 입니다.");
    }
  }
}
*/