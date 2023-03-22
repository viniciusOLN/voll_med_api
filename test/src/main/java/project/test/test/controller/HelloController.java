package project.test.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

   @GetMapping
   public String helloWorld(){
      return "<h1 style='color: red;'>hello world!</h1>";
   }
}
