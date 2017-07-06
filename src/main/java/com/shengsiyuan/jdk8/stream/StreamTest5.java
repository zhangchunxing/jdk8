package com.shengsiyuan.jdk8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by zhangchunxing on 2017/3/5.
 */
public class StreamTest5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world", "test");
        list.stream().map(String::toUpperCase)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println("---------------------");

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
        list2.stream().map(value -> value * value).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("---------------------");

        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1), Arrays.asList(2, 3),Arrays.asList(4, 5, 6));

//        stream.map(items -> {
//            List<Integer> list1 = new ArrayList<>();
//            for (Integer item: items) {
//                list1.add(item * item);
//            }
//            return list1.stream();
//        }).collect(Collectors.toList()).forEach(System.out::println);

        stream.flatMap(theLists -> theLists.stream()).map(value -> value * value).forEach(System.out::println);

    }
}
