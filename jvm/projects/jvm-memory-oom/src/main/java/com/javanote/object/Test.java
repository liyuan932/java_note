package com.javanote.object;

/**
 * @author wb-liyuan.j
 * @date 2017/6/23
 */
public class Test {
    private int a;

    private long b;

    private float c;

    private double d;

    private boolean e;

    private String f;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Test test = (Test) o;

        if (a != test.a) {
            return false;
        }
        if (b != test.b) {
            return false;
        }
        if (Float.compare(test.c, c) != 0) {
            return false;
        }
        if (Double.compare(test.d, d) != 0) {
            return false;
        }
        if (e != test.e) {
            return false;
        }
        return f != null ? f.equals(test.f) : test.f == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = a;
        result = 31 * result + (int) (b ^ (b >>> 32));
        result = 31 * result + (c != +0.0f ? Float.floatToIntBits(c) : 0);
        temp = Double.doubleToLongBits(d);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (e ? 1 : 0);
        result = 31 * result + (f != null ? f.hashCode() : 0);
        return result;
    }
}

