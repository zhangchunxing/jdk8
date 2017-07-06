package com.shengsiyuan.jdk8.stream2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

import static java.util.stream.Collector.Characteristics.CONCURRENT;
import static java.util.stream.Collector.Characteristics.IDENTITY_FINISH;
import static java.util.stream.Collector.Characteristics.UNORDERED;

/**
 * Created by zhangchunxing on 2017/4/8.
 */
public class MySetCollector<T> implements Collector<T, List<T>, List<T>>{


    @Override
    public Supplier<List<T>> supplier() {
        System.out.println("supplier invoked!");
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<T>, T> accumulator() {
        System.out.println("accumulator invoked!");
        return List<T>::add;
    }

    @Override
    public BinaryOperator<List<T>> combiner() {
        System.out.println("combiner invoked!");
        return (set1, set2) -> {
            set1.addAll(set2);
            return set1;
        };
    }

    @Override
    public Function<List<T>, List<T>> finisher() {
        System.out.println("finisher invoked!");
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoked!");

        return Collections.unmodifiableSet(EnumSet.of(UNORDERED, IDENTITY_FINISH));
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "welcome", "world");
        List<String> list1 = list.stream().collect(new MySetCollector<>());
        System.out.println( list1 );
    }
}
