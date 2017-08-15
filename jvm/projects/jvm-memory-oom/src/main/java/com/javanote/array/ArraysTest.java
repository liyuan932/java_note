package com.javanote.array;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author wb-liyuan.j
 * @date 2017/6/13
 */
public class ArraysTest {
    public static void main(String[] args) {
        int[] arr = {16,9,5,8,11,15,10,34};
        System.out.println(Arrays.binarySearch(arr, 5));

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.equals(arr,arr2));

        int[] arr3 = Arrays.copyOfRange(arr,3,6);  //[3,6)
        System.out.println(Arrays.toString(arr3));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //元素类型为引用类型
        System.out.println("----------------------");
        People[] p1 = {new People("lisi",14),new People("wangwu",15),new People("nana",16)};
        System.out.println(Arrays.toString(p1));

        People[] p2 = Arrays.copyOf(p1, p1.length);  //浅复制
        System.out.println(p1[0] == p2[0]); //true
        p1[0].setAge(18);
        System.out.println(p2[0].getAge());  //15
        System.out.println(Arrays.equals(p1,p2));

        Comparator<People> comparator = (o1, o2) -> o2.getName().compareTo(o1.getName());
        Arrays.sort(p1, comparator);
        System.out.println(Arrays.toString(p1));

        System.out.println(Arrays.binarySearch(p1, new People("wangwu", 15),comparator));
    }


    static class People{
        private String name;
        private int age;

        public People(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "People{" + "name='" + name + '\'' + ", age=" + age + '}';
        }
    }
}
