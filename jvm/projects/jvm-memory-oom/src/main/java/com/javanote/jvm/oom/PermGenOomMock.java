package com.javanote.jvm.oom;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

/**
 * 永久代OOM
 * VM args:
 *  -XX:+PrintGCDetails -XX:PermSize=2m -XX:MaxPermSize=2m (jdk6)
 *  -XX:+PrintGCDetails -XX:MetaspaceSize=8m -XX:MaxMetaspaceSize=8m (jdk8)
 * @author wb-liyuan.j
 * @date 2017/4/26
 */
public class PermGenOomMock{
    public static void main(String[] args) {
        URL url = null;
        List<ClassLoader> classLoaderList = new ArrayList<>();
        try {
            url = new File("/tmp").toURI().toURL();
            URL[] urls = {url};
            while (true){
                ClassLoader loader = new URLClassLoader(urls);
                classLoaderList.add(loader);
                loader.loadClass("com.javanote.jvm.oom.Test");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}