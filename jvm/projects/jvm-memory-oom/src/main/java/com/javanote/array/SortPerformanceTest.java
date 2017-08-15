package com.javanote.array;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 *  Arrays.parallelSort和Arrays.sort性能对比
 *  Arrays.parallelSort java8新增的并行排序算法，基于fork/join框架
 *  Arrays.sort 串行排序
 * @author wb-liyuan.j
 * @date 2017/6/13
 */
public class SortPerformanceTest {
    public static void main(String[] args){
        for(int i=2;i<Integer.MAX_VALUE;i*=2)
            test(i);

    }
    static void test(long limit){
        Random rand = new Random();
        IntStream stream = rand.ints(limit);
        int[] arr = stream.toArray();
        int[] arr1 = Arrays.copyOf(arr, arr.length);

        long t1 = System.currentTimeMillis();
        Arrays.parallelSort(arr);
        long t2 = System.currentTimeMillis();
        Arrays.sort(arr1);
        long t3 = System.currentTimeMillis();
        System.out.println("limit:"+limit+"\t parallelSort: "+(t2-t1)+"ms\tserialSort: "+(t3-t2)+"ms");
    }
}
