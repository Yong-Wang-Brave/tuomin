package com.example.tuomin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Slf4j
public class LogController {
 
    @PostMapping("sayHello")
    public String sayHello(String name){
        log.info("sayHello===>>>"+name);
        log.info("phone===>>>{}","13434345678");
        return "Hello,"+name;
    }
}