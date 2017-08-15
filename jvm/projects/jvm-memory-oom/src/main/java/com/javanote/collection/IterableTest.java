package com.javanote.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

/**
 * Iterable Colletion的父接口,作用：
 * 1、获取一个迭代器iterator，进行迭代；
 * 2、使用默认方法foreach进行遍历元素；
 */
public class IterableTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        //iterator遍历

        for (Iterator<Integer> iterator = list.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }

        //forEach遍历
        list.forEach(e -> System.out.println(e));


        long minId = 3;
        long maxId = 20;
        long startId = minId;
        for(long endId = startId + 5;endId < maxId + 1;){
            System.out.println(startId + "," + endId);
            startId = endId;
            endId = startId + 5;
        }
        System.out.println(startId + "," + (maxId + 1));
    }
}
