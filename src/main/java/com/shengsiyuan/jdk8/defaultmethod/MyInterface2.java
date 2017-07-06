package com.shengsiyuan.jdk8.defaultmethod;

/**
 * Created by zhangchunxing on 2017/2/23.
 */
public interface MyInterface2 {
    default void myMethod() {
        System.out.println("myMethod2");
    }
}
