package org.example.myapp;

import java.util.Scanner;

/**
 * 이 클래스는 한밭대학교 특강 실습 예제를 위한 첫 번째 클래스입니다.<br>
 * <code>App</code> 클래스!
 */
public class App {

  /**
   * 프로그램의 진입점(entry point) 메서드 입니다. 콘솔에 "Hello!" 메시지를 출력합니다.
   *
   * @param args 명령행 인수 배열 (이 프로그램에서는 사용되지 않음)
   */
  public static void main(String[] args) {
    //    String result =
    //        String.join(",", "aaa", "bbb", "ccc"); // 전형적인 static 메소드, 데이터가 들어있는 변수를 알 필요가 없음
    //    System.out.println(result);

    //    String str = new String("abcdefghijk"); // 문자열에서 부분 문자열을 추출해야 하므로 변수가 필요함
    //    str.substring(2, 6);
    //
    //    int r = Math.abs(-100); // static 메소드, 변수가 필요없음(그냥 외부적으로 받을 인자가 필요한 것임)
    //    System.out.println(r);
    //
    //    int[] arr1 = new int[] {100, 200, 300, 400, 500};
    //    int[] arr2 = Arrays.copyOf(arr1, 2); // 얘는 따로 변수가 필요없으니까 앞에 class가 옴
    //    for (int v : arr2) {
    //      System.out.print(v + ",");
    //    }
    //    System.out.println();
    //
    //    ArrayList list1 = null; // new ArrayList<>();  // ArrayList의 객체를 생성하라.
    //    list1.add(100);

    Scanner scanner = new Scanner(System.in);
    System.out.print("이름? ");
    String name = scanner.nextLine();
    System.out.printf("안녕하세요 %s 님!\n", name);
    scanner.close();
  }
}
