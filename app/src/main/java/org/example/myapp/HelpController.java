package org.example.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // request handler(요청이 왔을 때 호출되는 메소드)의 리턴 값은 Thymeleaf가 실행할 view(HTML파일, 템플릿파일) 이름이다.
public class HelpController {

  @GetMapping("/help") // path = value임 만약 아무것도 안적었으면 value=과 같다
  public String help() {
    return "help"; // 리턴값은 클라이언트에게 보낼 콘텐트가 아니다. Thymeleaf 엔진에게 알려줄 템플릿 파일 이름이다.
  }
}
