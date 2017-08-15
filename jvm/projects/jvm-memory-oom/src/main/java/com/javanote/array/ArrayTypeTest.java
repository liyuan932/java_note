package com.javanote.array;

/**
 * @author wb-liyuan.j
 * @date 2017/6/13
 */
public class ArrayTypeTest {
    public static void main(String[] args) {

        //有4个数组类型的变量指向同一个数组对象，数组的实际类型始终是Integer[]
        Integer[] arr1 = new Integer[3];
        Integer[] arr2 = arr1;
        Number[] arr3 = arr1;
        Object arr4 = arr1;
        System.out.println(arr1 == arr2);
        System.out.println(arr1 == arr3);
        System.out.println(arr1 == arr4);

        System.out.println(arr2.getClass());
        System.out.println(arr3.getClass());
        System.out.println(arr4.getClass());
    }
}
