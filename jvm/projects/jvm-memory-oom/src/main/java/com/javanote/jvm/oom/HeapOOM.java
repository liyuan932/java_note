package com.javanote.jvm.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * Java堆溢出
 * VM Args：
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+HeapDumpOnOutOfMemoryError
 * -Xms20M -Xmx20M 设置java堆的最大和最小内存
 * -XX:+PrintGCDetails可以打印GC日志
 * -XX:+HeapDumpOnOutOfMemoryError可以在OOM时打印堆转储文件
 */
public class HeapOOM {

    static class OOMObject {
        public void test(){
            List<Test> list = new ArrayList<Test>();

            while (true) {
                list.add(new Test());
            }
        }
    }

    public static void main(String[] args) {
        OOMObject oomObject = new OOMObject();
        oomObject.test();
    }
}