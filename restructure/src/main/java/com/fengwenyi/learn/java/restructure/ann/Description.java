package com.fengwenyi.learn.java.restructure.ann;

import java.lang.annotation.*;

/**
 * @author Wenyi Feng
 */
@Target({ElementType.METHOD, ElementType.TYPE}) // 方法 / 类 或者 接口 / [filed 字段]
@Retention(RetentionPolicy.RUNTIME) // 运行时
@Inherited // extends class 有效（接口 抽象类 都无效）
@Documented
public @interface Description {

    String value();
}
