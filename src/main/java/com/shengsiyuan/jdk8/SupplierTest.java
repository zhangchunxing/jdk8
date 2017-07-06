package com.shengsiyuan.jdk8;

import java.util.function.Supplier;

/**
 * Created by zhangchunxing on 2017/2/18.
 */
public class SupplierTest {
    public static void main(String[] args) {
//        Supplier<String> supplier = () -> "hello world";
//        System.out.println( supplier.get());
//        Supplier<Student> supplier = () -> new Student();
//        System.out.println(supplier.get().getName());
        Supplier<Student> supplier = Student::new;
        System.out.println(supplier.get().getName());
    }
}
