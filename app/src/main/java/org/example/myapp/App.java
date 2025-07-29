package org.example.myapp;

import com.google.common.base.Joiner;
import org.example.util.Utils;

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
    Utils.printMessage("Hello!");
    String message = Joiner.on(", ").join("hello", "world"); // 2개의 단어를 ,로 묶어서 하나의 문자열로!
    System.out.println(message);
  }
}
