package com.javanote.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * @author wb-liyuan.j
 * @date 2017/8/2
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a","b","c"));
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            int index = iterator.nextIndex();
            String next = iterator.next();
            System.out.println("index = " + index + ",value = " + next);
        }

        while (iterator.hasPrevious()){
            int index = iterator.previousIndex();
            String next = iterator.previous();
            System.out.println("index = " + index + ",value = " + next);
        }

        while (iterator.hasNext()){
            String next = iterator.next();
            iterator.set(next + "1");
            iterator.add(next + "2");
        }
        System.out.println(list);
    }
}
