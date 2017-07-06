package com.shengsiyuan.jdk8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhangchunxing on 2017/3/9.
 */
public class StreamTest10 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");
        //流具有短路操作：对于findFirst()操作一但找到符合条件的元素就直接返回流
        //不会再对后面的流元素执行任何操作
        //如： && ||
        list.stream().filter(str -> str.length() == 5).findFirst().ifPresent(System.out::println);
    }
}
