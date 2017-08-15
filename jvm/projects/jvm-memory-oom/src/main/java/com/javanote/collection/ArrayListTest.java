package com.javanote.collection;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author wb-liyuan.j
 * @date 2017/8/8
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4));
        for(Integer i : list3){
            System.out.println(i);
        }
    }
}
