package com.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by 85239 on 2017/1/15.
 */
public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        //Note that instances of functional interfaces can be created with
        //lambda expressions, method references, or constructor references.
        /*list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println( integer );
            }
        });
        list.forEach((Integer i) -> { //Lambda表达式创建一个函数式接口的引用
            System.out.println(i);
        });*/
        list.forEach(System.out::println);  //方法引用（method references）创建一个函数式接口的引用
    }
}
