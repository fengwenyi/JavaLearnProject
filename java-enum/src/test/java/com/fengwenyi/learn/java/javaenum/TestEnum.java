package com.fengwenyi.learn.java.javaenum;

import org.junit.Test;

/**
 * @author Wenyi Feng
 */
public class TestEnum {

    @Test
    public void simple() {
        UserStatus userStatus = UserStatus.LOGIN;
        System.out.format("枚举索引：%s", userStatus.ordinal());
        System.out.println();
        System.out.format("枚举名称：%s", userStatus.name());
        System.out.println();
    }

    /**
     * 遍历
     */
    @Test
    public void all() {
        System.out.println("方法一：");
        Class c = UserStatus.class;
        for (Object obj : c.getEnumConstants()) {
            System.out.println(obj);
        }
        System.out.println("-----------------");
        System.out.println("方法二：");
        for (UserStatus userStatus : UserStatus.values()) {
            System.out.println(userStatus);
        }
    }

    /**
     * use
     */
    @Test
    public void use() {
        ReturnCode returnCode = ReturnCode.SUCCESS;
        System.out.println("code: " + returnCode.getCode());
        System.out.println("msg: " + returnCode.getMsg());

    }

}
