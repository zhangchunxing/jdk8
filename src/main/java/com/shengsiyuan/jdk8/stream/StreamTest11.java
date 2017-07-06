package com.shengsiyuan.jdk8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by zhangchunxing on 2017/3/11.
 */
public class StreamTest11 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello welcome", "hello world",
                "hello world hello", "hello welcome");
        list.stream().flatMap(str -> Arrays.stream(str.split(" ")))
                .distinct().collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
