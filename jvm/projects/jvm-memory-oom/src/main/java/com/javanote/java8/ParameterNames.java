package com.javanote.java8;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * 参数名称
 * javac -parameters 把参数名称保留在Java字节码中
 * 通过反射API与Parameter.getName()方法获取参数名称
 * @author wb-liyuan.j
 * @date 2017/7/6
 */
public class ParameterNames {
    public static void main(String[] args) throws Exception {
        Method method = ParameterNames.class.getMethod("main", String[].class);
        for (final Parameter parameter : method.getParameters()) {
            System.out.println("Parameter: " + parameter.getName());
        }
    }
}