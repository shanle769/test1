package condition;
/*
방식1 : 범위 : 비교 + 논리 연산자
점수 :
점수가 60미만 :재시험
60 ~ 70미만 : 경고
70 ~ 80미만 : 통과
80 ~ 100 : 1학기프리패스
* */

public class If4 {
    public static void main(String[] args) {
      int score = 80; // 초기값 - 변경되는값

      if (score < 60) {
        System.out.println("재시험");
      } // end if
      if (score <= 70) {
        System.out.println("경고");
      }// end if
      if (score <= 80) {
        System.out.println("통과");
      }// end if
      if (score <= 100) {
        System.out.println("1학기 프리패스");
      }// end if
    }
  }

  /*
    int score = 100;
      if ( score < 60 ) {
        System.out.println("재시험");
      }
      if ( score >= 60 && score < 70 ) {
        System.out.println("경고");
      }
      if ( score >= 70 && score < 80 ) {
        System.out.println("통과");
      }
      if ( score >= 80 && score <= 100 ) {
        System.out.println("1학기프리패스");
      }
  * */