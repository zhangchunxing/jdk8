package com.shengsiyuan.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by 85239 on 2017/2/6.
 */
public class Test3 {
    public static void main(String [] args) {
//        MyInterface1 i1 = () -> {
//            System.out.println("myMethod1()");
//        };
//        MyInterface2 i2 = () -> {};
//        i1.myMethod1();
//        System.out.println(i1.getClass().getInterfaces()[0]);
//        System.out.println(i2.getClass().getInterfaces()[0]);
//
//        new Thread(() -> {
//            System.out.println("hello word!");
//        }).start();

        List<String> list = Arrays.asList("hello", "world", "hello world");
//        list.forEach((s) -> {
//            System.out.println(s.toUpperCase());
//        });

        List<String> list1 = new ArrayList<>();
//        list1.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                list1.add(s.toUpperCase());
//            }
//        });

//        list1.forEach(item -> System.out.println(item));
//        list1.stream().map(item -> item.toUpperCase()).forEach(item -> System.out.println(item));
//        list1.stream().map(String::toUpperCase).forEach(item -> System.out.println(item));

//        Function<String, String> fun = String::toUpperCase;
//        System.out.println(fun.getClass().getInterfaces()[0]);
    }
}

@FunctionalInterface
interface MyInterface1 {
    void myMethod1();
}

@FunctionalInterface
interface MyInterface2 {
    void myMethod2();
}
