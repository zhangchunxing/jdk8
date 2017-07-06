package com.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by zhangchunxing on 2017/2/15.
 */
public class PredicateTest2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        PredicateTest2 test2 = new PredicateTest2();
//        test2.confiditionFilter(list, item -> true);
        test2.confiditionFilter2(list, item -> item > 5, item2 -> item2 % 2 == 0);
    }

    public void confiditionFilter(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer item : list) {
            if (predicate.test(item))
                System.out.println(item);
        }
    }

    public void confiditionFilter2(List<Integer> list, Predicate<Integer> predicate1,
                                   Predicate<Integer> predicate2) {
        for (Integer item: list) {
            if (predicate1.and(predicate2).test(item)) {
                System.out.println(item);
            }

        }
    }
}
