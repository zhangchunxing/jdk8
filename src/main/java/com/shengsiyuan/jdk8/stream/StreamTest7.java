package com.shengsiyuan.jdk8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhangchunxing on 2017/3/6.
 */
public class StreamTest7 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");
//        list.stream().map(item -> item.substring(0, 1).toUpperCase() + item.substring(1))
//                .forEach(System.out::println);
        /**
         * 不加forEach这种终止操作，是不会打印"test"的
         */
        list.stream().map(item -> {
            String result = item.substring(0, 1).toUpperCase() + item.substring(1);
            System.out.print("test");
            return result;
            });
    }
}
