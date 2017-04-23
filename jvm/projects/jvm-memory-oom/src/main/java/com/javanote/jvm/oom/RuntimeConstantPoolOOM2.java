package com.javanote.jvm.oom;

public class RuntimeConstantPoolOOM2 {

    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);

        String s1 = new String("ab");
        String s2 = s1.intern();
        String s3 = new String("ab");
        String s4 = s3.intern();
        String s5 = "a" + "b";
        String s6 = "a" + new String("b");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        System.out.println(s2 == s4);
        System.out.println(s4 == s5);
        System.out.println(s4 == s6);
    }
}