package org.example.myapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 무조건 객체 생성 / 동시에 클래스 이름과 같은 !객체!가 자동 생성 / request handler를 가지는 메소드에 대해서 붙이면 됨
@RequestMapping("/hello")
public class Hello {

  public Hello() {
    System.out.println("Hello의 생성자가 호출됨!");
  }

  @GetMapping(path = "/hi") // url과 매소드를 연결
  public String hi() { // 요청을 처리하는 메서드 ==> request handler
    return "Hello!";
  }

  @GetMapping(path = "/hi2") // url과 매소드를 연결
  public String hi2(String name) { // name으로 넘어오는 값을 받고 싶으면 똑같이 'name'의 값을 적으면 된다.
    return "안녕하세요 " + name + "님!";
  }

  @GetMapping(path = "/hi3") // url과 매소드를 연결
  public String hi3() { // 요청을 처리하는 메서드 ==> request handler
    return "Hello3!";
  }

  @GetMapping(path = "/hi4") // url과 매소드를 연결
  public String hi4() { // 요청을 처리하는 메서드 ==> request handler
    return "Hello4!";
  }

  @GetMapping(path = "/hi5") // url과 매소드를 연결
  public String hi5() { // 요청을 처리하는 메서드 ==> request handler
    return "Hello5!";
  }
}
