package com.javanote.jvm.load;

/**
 * @author wb-liyuan.j
 * @date 2017/5/24
 */
public class SubClass extends SuperClass {
    static {
        System.out.println("SubClass init");
    }
}
