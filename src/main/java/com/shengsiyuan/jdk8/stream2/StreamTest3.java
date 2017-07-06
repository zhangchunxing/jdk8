package com.shengsiyuan.jdk8.stream2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhangchunxing on 2017/5/14.
 */
public class StreamTest3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "welcome");
       // list.stream().forEach(System.out::println);
        list.stream().map(item -> item + "_abc").forEach(System.out::println);
    }
}
