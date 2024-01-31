package exsample;

import java.util.Scanner;

public class Ex12 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String grade , result = "";
    System.out.print("등급을 입력하세요 : ");
    grade = scanner.nextLine();

    result = switch ( grade ) {
      case "A" -> result = "최고점수";
      case "B" -> result = "시험에 통과";
      case "C" -> result = "노력이 필요";
      case "D" -> result = "재시험";
      case "F" -> result = "불합격 재시험 불가";
      default -> result = "잘못된 학점";
    };
    System.out.println( result );
  }
}

/*
switch ( grade ) {
      case "A" :
        System.out.println("최고점수"); break;
      case "B" :
        System.out.println("시험에 통과"); break;
      case "C" :
        System.out.println("노력이 필요"); break;
      case "D" :
        System.out.println("재시험"); break;
      case "F" :
        System.out.println("불합격 재시험 불가"); break;
      default:
        System.out.println("잘못된 학점");
    }
*/