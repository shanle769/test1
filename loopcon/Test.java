package loopcon;

public class Test {
  public static void main(String[] args) {
    /*
    * 반복문
    * 1. for : 횟수가 정해질때 - 몇번 반복해 ~
    * 2. while : 무한반복 + if + break
    *             아이디, 비번
    *             게임 exit 하면 중단
    *             메뉴선택
    * 3. do ~ while문 : 조건에 만족하지 않아도 무조건 한번실행
    *
    * 1. for문 : 몇번 반복해
    * for( 초기값 ; 조건식 ; 증감식 ){
    *  true - 실행문 ;
    * }
    * 초기값 : 시작값 , 변수, i , j , k 순으로
    * 조건식 : ~ 까지, 관계연산자 true/false
    * 증감식 : ++변수 , --변수 , 수식
    * */

    int num = 0;
    num++; // num = num +1 , num += 1
    System.out.println("현재 값 : " + num);

    num++;
    System.out.println("현재 값 : " + num);

    num++;
    System.out.println("현재 값 : " + num);

    num++;
    System.out.println("현재 값 : " + num);

    /*
    * 1 ~ 4 까지 출력 예제
    * 반복횟수 : i가 1부터 4까지 1씩 증가
    * 규칙성 : 숫자 1 ~ 4
    * 반복횟수는 초기화, 조건식, 증감식으로 결정
    * 규칙성은 실행물을 결정
    * */

    for( int i = 1 ; i <= 4 ; i++) {
      System.out.println("현재 값 : " + i);
    } // end for
  }
}




/*
 int num = 0;
    num++; // num = num +1 , num += 1
    System.out.println("현재 값 : " + num);

    num++;
    System.out.println("현재 값 : " + num);

    num++;
    System.out.println("현재 값 : " + num);

    num++;
    System.out.println("현재 값 : " + num);
  }
}
*/