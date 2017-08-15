package com.javanote.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 求两个集合的交集、并集、补集
 * @author wb-liyuan.j
 * @date 2017/8/2
 */
public class CollectionTest {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,3,4));
        boolean res = list1.retainAll(list2);
        System.out.println(res);
        System.out.println("list1和list2的交集：" + list1);

        list1 = new ArrayList<>(Arrays.asList(1,2));
        list2 = new ArrayList<>(Arrays.asList(3,4,5));
        res = list1.addAll(list2);
        System.out.println(res);
        System.out.println("list1和list2的交集：" + list1);

        list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list2 = new ArrayList<>(Arrays.asList(1,3));
        res = list1.removeAll(list2);
        System.out.println(res);
        System.out.println("list2在list1中的补集：" + list1);
    }
}
