package com.shengsiyuan.jdk8;

import java.util.function.Function;

/**
 * Created by 85239 on 2017/2/8.
 */
public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest2 test = new FunctionTest2();
//        Add add = test.new Add();
//        Function<Integer, Integer> add = value -> value + 2;
//        Function<Integer, Integer> add = new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer integer) {
//                return integer + 2;
//            }
//        };
//        System.out.println(test.compute(3, item -> item + 2));
//        System.out.println(test.convert(1, integer -> integer.toString()));
//        System.out.println(test.compute(1, add));



    }

    public int compute(int a, Function<Integer, Integer> function) {
        int result = function.apply(a);
        return result;
    }

    public String convert (int a, Function<Integer, String> function) {
        return function.apply(a);
    }

//    class Add implements Function<Integer, Integer> {
//        @Override
//        public Integer apply(Integer integer) {
//            return integer + 2;
//        }
//    }



}


