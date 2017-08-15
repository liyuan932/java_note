package com.javanote.array;

import java.util.Arrays;

/**
 * @author wb-liyuan.j
 * @date 2017/6/12
 */
public class ArrayNewTest {
    public static void main(String[] args) {
        //静态初始化
        int[] i1 = {1,2,3};
        System.out.println(i1.length);

        //动态初始化，未赋值前为零值
        int[] i2 = new int[3];
        i2[0] = 1;
        i2[2] = 3;
        System.out.println(Arrays.toString(i2));
        i2[3] = 4;  //数组下标越界
    }
}
