package com.javanote.collection;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author wb-liyuan.j
 * @date 2017/8/17
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1,2,3,4));
        LinkedList<Integer> list2 = new LinkedList<Integer>(Arrays.asList(5,6));
        list.addAll(1     , list2);
        System.out.println(list);

    }
}
