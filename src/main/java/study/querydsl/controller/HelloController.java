package study.querydsl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kimdonghyun on 20/01/2020.
 */

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello(){
        return "asdasdasd";
    }
}
