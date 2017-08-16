package com.javanote.collection;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author wb-liyuan.j
 * @date 2017/8/8
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list3 = new ArrayList<>();
        for(int i=0;i<1000000;i++){
            list3.add(i);
        }
        int value;
        long s1 = System.currentTimeMillis();
        for (Integer i : list3) {
            value = i;
        }
        long s2 = System.currentTimeMillis();
        for(int i =0; i < list3.size();i++){
            value = list3.get(i);
        }
        long s3 = System.currentTimeMillis();
        for(Iterator<Integer> iter = list3.iterator(); iter.hasNext();){
            value = iter.next();
        }
        long s4 = System.currentTimeMillis();
        System.out.println((s2 - s1) + "ms");
        System.out.println((s3 - s2) + "ms");
        System.out.println((s4 - s3) + "ms");

    }
}
