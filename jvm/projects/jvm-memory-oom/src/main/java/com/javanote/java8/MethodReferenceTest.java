package com.javanote.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

/**
 * 方法引用
 * @author wb-liyuan.j
 * @date 2017/7/5
 */
public class MethodReferenceTest {

    public static void main(String[] args) {
        Car car = Car.create(Car::new);
        List<Car> cars = Collections.singletonList(car);

        cars.forEach(Car::collide);  //使用当前类作为参数的静态方法
        cars.forEach(Car::repair);   //不带参数的实例方法  ***

        Car police = Car.create(Car::new);
        cars.forEach(police::follow);       //调用参数为别一个Car类的实例方法
        cars.forEach(System.out::println);  //当前实例作为其它类实例方法的参数  ***
        People people = new People();
        cars.forEach(people::run);
    }

    static class Car {
        static Car create(final Supplier<Car> supplier) {
            return supplier.get();
        }

        static void collide(final Car car) {
            System.out.println( "Collided " + car.toString() );
        }

        void follow( final Car another ) {
            System.out.println( "Following the " + another.toString() );
        }

         void repair() {
            System.out.println( "Repaired " + this.toString() );
        }
    }

    static class People{
        void run(Car car){
            System.out.println("people run car");
        }
    }
}

