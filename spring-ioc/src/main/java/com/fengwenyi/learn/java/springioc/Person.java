package com.fengwenyi.learn.java.springioc;

import org.springframework.stereotype.Component;

/**
 * @author Wenyi Feng
 */
@Component
public class Person {

    private String name;

    public Person() {}

    public void sayHello() {
        System.out.format("%s说：Hello.", name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
