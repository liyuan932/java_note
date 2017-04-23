package com.javanote.jvm.gc;


import java.lang.ref.SoftReference;

public class SoftReferenceTest {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] bytes = new byte[1 * _1MB];
        SoftReference<byte[]> softReference = new SoftReference<>(bytes);
        bytes = null;
        byte[] bytes2 = new byte[8 * _1MB];
        System.gc();
    }
}
