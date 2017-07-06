package com.shengsiyuan.jdk8.defaultmethod;

/**
 * Created by zhangchunxing on 2017/2/23.
 */
public interface MyInterface1 {
    default void myMethod() {
        System.out.println("myMethod1");
    }

}
