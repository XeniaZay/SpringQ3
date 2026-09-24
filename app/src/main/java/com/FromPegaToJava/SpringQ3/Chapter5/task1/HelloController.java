package com.FromPegaToJava.SpringQ3.Chapter5.task1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring Boot!";
    }

}