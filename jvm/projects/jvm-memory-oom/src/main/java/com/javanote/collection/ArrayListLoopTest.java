package com.javanote.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author wb-liyuan.j
 * @date 2017/8/16
 */
public class ArrayListLoopTest {
    public static void main(String[] args) {
        // 准备数据阶段
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }

        // 测试阶段
        int runCounts = 10000; // 执行次s数
        int listSize = list.size();
        int value;

        // For循环的测试
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < runCounts; i++) {
            loopOfFor(list);
        }
        long endTime1 = System.currentTimeMillis();

        // Foreach循环的测试
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < runCounts; i++) {
            loopOfForeach(list);
        }
        long endTime2 = System.currentTimeMillis();

        // Iterator迭代器的测试
        long startTime3 = System.currentTimeMillis();
        for (int i = 0; i < runCounts; i++) {
            loopOfIterator(list);
        }
        long endTime3 = System.currentTimeMillis();

        System.out.println("loopOfFor: " + (endTime1 - startTime1) + "ms");
        System.out.println("loopOfForeach: " + (endTime2 - startTime2) + "ms");
        System.out.println("loopOfIterator: " + (endTime3 - startTime3) + "ms");
    }

    /**
     * 由于ArrayList实现了RandomAccess接口，它支持通过索引值去随机访问元素。
     *
     * @param list
     */
    public static void loopOfFor(List<Integer> list) {
        int value;
        int size = list.size();
        // 基本的for
        for (int i = 0; i < size; i++) {
            value = list.get(i);
        }
    }

    /**
     * 使用forecah方法遍历数组
     *
     * @param list
     */
    public static void loopOfForeach(List<Integer> list) {
        int value;
        // foreach
        for (Integer integer : list) {
            value = integer;
        }
    }

    /**
     * 通过迭代器方式遍历数组
     *
     * @param list
     */
    public static void loopOfIterator(List<Integer> list) {
        int value;
        // iterator
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            value = iterator.next();
        }
    }
}
