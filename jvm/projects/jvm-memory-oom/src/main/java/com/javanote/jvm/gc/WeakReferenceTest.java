package com.javanote.jvm.gc;


import java.lang.ref.WeakReference;

public class WeakReferenceTest {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] bytes = new byte[1 * _1MB];
        WeakReference<byte[]> weakReference = new WeakReference<>(bytes);
        bytes = null;
        System.gc();
    }
}
