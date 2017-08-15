package com.javanote.array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 数组的反射API
 * @author wb-liyuan.j
 * @date 2017/6/13
 */
public class ArrayReflectTest {
    public static void main(String[] args) {
        int[] iarr = (int[]) Array.newInstance(int.class, 3);
        Array.setInt(iarr,0,1);
        Array.setInt(iarr,1,3);
        Array.setInt(iarr,2,5);
        System.out.println(Array.getLength(iarr));
        System.out.println(Array.getInt(iarr, 1));

        //创建二维数组
        int[][] iarr2 = (int[][]) Array.newInstance(int.class, 1, 1);
        Array.set(iarr2,0,iarr);
        System.out.println((Array.get(Array.get(iarr2,0),2)));
    }
}
