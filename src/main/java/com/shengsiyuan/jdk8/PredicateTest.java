package com.shengsiyuan.jdk8;

import java.util.function.Predicate;

/**
 * Created by zhangchunxing on 2017/2/13.
 */
public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> predicate = item -> item.length() > 5;
        System.out.println(predicate.test("hello"));
    }
}
