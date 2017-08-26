package com.javanote.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiConsumer;

/**
 * @author wb-liyuan.j
 * @date 2017/8/8
 */
public class BatchOperationTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        part(0,list.size()-1,7,(start, end) -> System.out.println(list.subList(start,end)));


    }

    private static void part(int start, int end, int lines, BiConsumer<Integer, Integer> biConsumer) {
        int _start = start, _end;
        for (_end = _start + lines; _end < end + 1; ) {
            biConsumer.accept(_start, _end);
            _start = _end;
            _end += lines;
        }
        biConsumer.accept(_start, end + 1);
    }
}
