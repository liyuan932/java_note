package com.javanote.array;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 数组成员
 */
public class ArrayMemberTest {
    public static void main(String[] args) {
        int[] arr = new int[4];

        System.out.println("array length : " + arr.length);
        int[] arr2 = arr.clone();
        System.out.println(arr == arr2);

        Class<? extends int[]> aClass = arr.getClass();
        System.out.println(aClass);
        System.out.println(aClass.getSuperclass());
        System.out.println(Arrays.toString(aClass.getInterfaces()));
    }


    /**
     * 数组的实现
     * @param <T> 数组元素类型
     */
    class A<T> implements Cloneable,Serializable {

        public final int length = 5;

        @Override
        protected T[] clone(){
            try{
                return (T[]) super.clone();
            } catch (CloneNotSupportedException e) {
                throw  new InternalError(e.getMessage());
            }
        }
    }
}
