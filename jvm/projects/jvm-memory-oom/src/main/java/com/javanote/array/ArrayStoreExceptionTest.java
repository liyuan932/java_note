package com.javanote.array;

/**
 * 数组存储异常
 * jvm在给数组元素赋值时会检查实际的元素类型
 * @author wb-liyuan.j
 * @date 2017/6/13
 */
public class ArrayStoreExceptionTest {
    public static void main(String[] args) {
        Integer[] iarr = new Integer[3];
        Object[]  objarr = iarr;
        objarr[0] = new Object();
    }
}
