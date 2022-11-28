package org.code_with_abdullah.Controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/hello-world")
public class HelloWorldController {

    @GetMapping("")
    public static String helloWorld() {
        return "Hello world";
    }

    @GetMapping("/some-one")
    public static String helloSomeone() {
        return "Some one";
    }
}
