package com.javanote.jvm.load;

/**
 * @author wb-liyuan.j
 * @date 2017/5/24
 */
public class SuperClass{
    public static int value = 123;
    static{
        System.out.println("SuperClass init");
    }
}
