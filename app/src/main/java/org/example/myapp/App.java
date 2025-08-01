package org.example.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
// 스프링 부트를 실행할 수 있도록 기본 정보를 자동 설정
@EnableAutoConfiguration // 톰캣 서버 실행에 관련된 기초 설정을 자동으로 처리
// 스트링부트 설정하는 클래스(설정을 기본값으로 자동 설정)

// 현재 클래스와 같은 패키지 및 하위 패키지를 다 뒤져서 컴포넌트를 찾아 자동 생성하라는 설정!
// => @Componenet, @RestController, @Controller, @Service, @Repository 등이 붙은 클래스를 찾는다.
@ComponentScan
// 객체는 객체인데 특별한 역할을 함 (클라이언트의 요청이 오면 응답을 하는 역할 = controller)
*/

@SpringBootApplication // @SpringBootConfiguration + @ EnableAutoConfiguration + @ComponentScan
// 실제 main임을 알려주는 에노테이션(main이 한개 일 때 굳이 붙이지 않아도 된다.)
public class App {

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

    //    class Calculator {
    //      int result;
    //
    //      void plus(int a) {
    //        this.result += a;
    //      }
    //
    //      void minus(int a) {
    //        this.result -= a;
    //      }
    //    }
    //
    //    Calculator c1 = new Calculator();
    //    Calculator c2 = new Calculator();
    //
    //    c1.plus(100);
    //    c2.minus(555);

    SpringApplication.run(App.class, args);
    System.out.println("스프링부트 서버 시작!");
  }
}
