package com.fengwenyi.learn.java.springaop;

import com.fengwenyi.learn.java.springaop.service.EatService;
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
    private EatService eatService;

    @GetMapping("/eat")
    public String eat() {
        eatService.eat();
        return "s";
    }

}
