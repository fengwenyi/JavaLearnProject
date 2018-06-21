package com.fengwenyi.learn.java.springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wenyi Feng
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private Person person;

    @GetMapping("/hello")
    public String hello() {
        person.setName("Wenyi Feng");
        person.sayHello();
        return "s";
    }

}
