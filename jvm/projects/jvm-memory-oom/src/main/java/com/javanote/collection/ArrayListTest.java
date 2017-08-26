package com.javanote.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.function.BiConsumer;

/**
 * @author wb-liyuan.j
 * @date 2017/8/8
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        for(ListIterator<Integer> iter = list.listIterator();iter.hasNext();){
            System.out.println(iter.nextIndex());
            iter.next();
        }


    }
}
