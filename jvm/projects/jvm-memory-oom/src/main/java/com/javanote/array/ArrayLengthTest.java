package com.javanote.array;

/**
 * 数组创建后，数组对象的长度是不变的
 * @author wb-liyuan.j
 * @date 2017/6/13
 */
public class ArrayLengthTest {
    public static void main(String[] args) {
        int[] a = new int[4];
        int[] b = new int[3];
        a = b;
        System.out.println(a.length);  //3，数组的长度不是变了吗？
        System.out.println(b.length);  //3

        /*
         * 分析：
         * a = b后，变量a和b都指向长度为3的数组
         */
    }
}
