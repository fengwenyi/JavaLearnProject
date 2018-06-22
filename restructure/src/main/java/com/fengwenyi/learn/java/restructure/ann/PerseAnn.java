package com.fengwenyi.learn.java.restructure.ann;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author Wenyi Feng
 */
public class PerseAnn {

    public static void main(String[] args) {

        try {
            // 使用类加载器加载类
            Class c = Class.forName("com.fengwenyi.learn.java.restructure.ann.Child");

            // 找到类上的注解
            boolean isExistClassAnn = c.isAnnotationPresent(Description.class);
            if (isExistClassAnn) {
                // 拿到注解实例
                Description d = (Description) c.getAnnotation(Description.class);
                System.out.println(d.value());
            }

            // 找到方法上的注解
            Method[] methods = c.getMethods();
            for (Method method : methods) {
                boolean isExistMethodAnn = method.isAnnotationPresent(Description.class);
                if (isExistMethodAnn) {
                    Description d = method.getAnnotation(Description.class);
                    System.out.println(d.value());
                }
            }

            // 另一种解析方法
            for (Method method : methods) {
                Annotation [] annotations = method.getAnnotations();
                for (Annotation annotation : annotations) {
                    if (annotation instanceof Description) {
                        Description d = (Description) annotation;
                        System.out.println(d.value());
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
