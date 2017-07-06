package com.shengsiyuan.jdk8.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhangchunxing on 2017/2/26.
 */
public class StreamTest3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 6, 8);
        System.out.println(list.stream().map(value -> 2 * value).reduce(0, Integer::sum));
    }
}
