
package com.janadi.mavenspringbootjenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HomeController {

  @GetMapping
  public String home() {
    return "Hello World";
  }

  @GetMapping("/hi")
  public String hi(){
    return "Hiiiii there";
  }

}
