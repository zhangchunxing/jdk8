package com.shengsiyuan.jdk8.stream2;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparatorTest2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("nihao", "hello", "world", "welcome");
        //按字符串长度排序
        Collections.sort(list, (item1, item2) -> item1.length() - item2.length() );
        //按字符串长度排序,再反转排序结果
        Collections.sort(list, Comparator.comparingInt((item) -> item.length()));

        list.forEach(System.out::println);
    }
}
