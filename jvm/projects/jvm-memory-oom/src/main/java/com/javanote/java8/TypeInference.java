package com.javanote.java8;

/**
 * 类型推导
 *
 * @author wb-liyuan.j
 * @date 2017/7/6
 */
public class TypeInference {

    static class Value<T> {
        public static <T> T defaultValue() {
            return null;
        }

        public T getOrDefault(T value, T defaultValue) {
            return (value != null) ? value : defaultValue;
        }
    }

    public static void main(String[] args) {
        final Value<String> value = new Value<>();
        System.out.println(value.getOrDefault(null, Value.defaultValue()));
    }


}
