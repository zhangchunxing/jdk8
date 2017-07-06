package com.shengsiyuan.jdk8.stream;

import java.util.stream.IntStream;

/**
 * Created by zhangchunxing on 2017/3/6.
 */
public class StreamTest8 {
    public static void main(String[] args) {
        IntStream.iterate(0, item -> (item + 1) % 2).limit(6).distinct().forEach(System.out::println);
    }
}
