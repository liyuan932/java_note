package com.javanote.java8;

import java.util.function.Supplier;

public class DefaulableTest {
    public static void main(String[] args) {
        System.out.println(new DefaultableImpl().notRequired());
        System.out.println(new OverridableImpl().notRequired());

        Defaulable defaulable = DefaulableFactory.create(DefaultableImpl::new);
        System.out.println(defaulable.notRequired());
        defaulable = DefaulableFactory.create(OverridableImpl::new);
        System.out.println(defaulable.notRequired());
    }

    interface Defaulable {
        // Interfaces now allow default methods, the implementer may or
        // may not implement (override) them.
        default String notRequired() {
            return "Default implementation";
        }
    }

    static class DefaultableImpl implements Defaulable {
    }


    static class OverridableImpl implements Defaulable {
        @Override
        public String notRequired() {
            return "Overridden implementation";
        }
    }


    interface DefaulableFactory {
        // Interfaces now allow static methods
        static Defaulable create(Supplier<Defaulable> supplier) {
            return supplier.get();
        }
    }
}

