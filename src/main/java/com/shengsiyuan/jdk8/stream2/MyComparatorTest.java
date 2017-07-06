package com.shengsiyuan.jdk8.stream2;

import java.io.Serializable;
import java.util.*;

/**
 * Created by zhangchunxing on 2017/3/31.
 */
public class MyComparatorTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("nihao", "hello", "world", "welcome");
        Collections.sort(list, (item1, item2) -> item1.length() - item2.length() );
        //Comparator<String> cmp = Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER);
        //Comparator<String> cmp = Comparator.comparingInt(item -> item.length()).reversed();
        //Collections.sort(list, Comparator.comparingInt((item) -> item.length()).reversed());
        //Collections.sort(list, Comparator.comparingInt((item) -> item.length()));
        //Collections.sort(list, Comparator.comparingInt((String item) -> item.length()).thenComparing((item1, item2) -> item1.toUpperCase().compareTo(item2.toUpperCase())));
        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(Comparator.comparing(String::toUpperCase)));
        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(Comparator.comparing(String::toUpperCase, Comparator.reverseOrder())));
        System.out.println(list);




    }
}
