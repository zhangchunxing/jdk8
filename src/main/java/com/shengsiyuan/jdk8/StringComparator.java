package com.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by 85239 on 2017/2/7.
 */
public class StringComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");
//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });

        // expression o2.compareTo(o1)
        // statement { return o2.compareTo(o1); }
        Collections.sort(names, (o1, o2) -> o2.compareTo(o1));

//        Collections.sort(names, Comparator.reverseOrder());
//        System.out.println(names);
    }



}
