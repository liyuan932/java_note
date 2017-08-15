package com.javanote.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author wb-liyuan.j
 * @date 2017/7/3
 */
public class FunctionalTest {
    public static void main(String[] args) {
        Arrays.asList("a","b","c").forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        Arrays.asList("a","b","c").forEach(e -> System.out.println(e));

        Arrays.asList("a","b","c").forEach(e -> {
            System.out.println(e);
            System.out.println(e);
        });


        Arrays.asList("a","b","c").sort((o1, o2) -> o1.compareTo(o2));

        Arrays.asList("a","b","c").sort((o1, o2) -> {
            int result = o1.compareTo(o2);
            return result;
        });

    }
}
