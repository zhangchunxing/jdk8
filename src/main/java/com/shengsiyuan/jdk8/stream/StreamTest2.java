package com.shengsiyuan.jdk8.stream;

import java.util.stream.IntStream;

/**
 * Created by zhangchunxing on 2017/2/26.
 */
public class StreamTest2 {
    public static void main(String[] args) {
        IntStream.of(new int[] {1, 2, 3, 4, 5}).forEach(System.out::println);
        System.out.println("----------------------");
        IntStream.range(3, 8).forEach(System.out::println);
        System.out.println("----------------------");
        IntStream.rangeClosed(3, 8).forEach(System.out::println);
    }
}
