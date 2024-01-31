package variable; // 폴더

public class Var1 {
  public static void main(String[] args) {
    int a = 100; // a 변수 (그릇) 100값을 대입(치환)
    int score = 80;
    char ch = 'A';
    String str1 = "B"; // 문자열, 문자 => String , char 많이 사용하지 않는다
    String str2 = "안녕 자바" ;
    boolean done = true ;
    byte b = 127;
    short s = 32767;
    double num1 = 10.1; // 실수 기본형
    float num2 = 10.2f; // f, F


    System.out.println( a );
    System.out.println( score );
    System.out.println( ch );
    System.out.println( str1 );
    System.out.println( done );
    System.out.println( b );
    System.out.println( s );
    System.out.println( num1 );
    System.out.println( num2 );
  }
}
/*
*  변수 : 변하는 값을 저장하는 저장공간
*                             (메모리공간)
*  예) 아이디, 이메일 비밀번호, 상품명,
*       상품개수, 주민번호 등등
*
*  이름규칙 - 변수규칙
*  1. 영문자, 숫자, _, $ 사용가능
*  2. 첫글자는 숫자를 제외
*     단 영문자 소문자로 시작
*     클래스명 첫글자 대문자라서
*  3. 한글가능 사용하지말자 ?
*     예약어 사용불가 (java에서 쓰고있는 명령어)
*  4. 두단어가 합쳐지면 두번째 단어 첫글자는 대문자로 시작
*     낙타표기법 ( 카멜케이스 )
*     dogcat => dogCat
*     myname => myName
*  5. 이름은 의미맞는 영문이름
*
*  클래스명 :
*     첫글자 대문자
*     두단어가 합쳐지면 낙타표기법
*     DogCat , MyName
*
*  타입
*   정수 : int 기본
*          20억 ? long
*   실수 : double 기본
*          float 정밀도가 떨어진다 거의 사용하지 않는다
*   boolean : 논리값 true/false
*
*   타입 그릇1 = 물 ;
*   타입 그릇2 = 국 ;
*
*   그릇2 => 국담긴값 출력
*
* */