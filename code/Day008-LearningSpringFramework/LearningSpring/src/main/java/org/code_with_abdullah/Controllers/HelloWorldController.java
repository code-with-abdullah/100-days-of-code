package org.code_with_abdullah.Controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorldController {

    @GetMapping("/hello-world")
    public static String helloWorld() {
        return "Hello world";
    }
}
