package com.shengsiyuan.jdk8.stream2;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;


/**
 * Created by zhangchunxing on 2017/4/10.
 */
public class MySetCollector3<T> implements Collector<T, List<T>, List<T>> {
    @Override
    public Supplier<List<T>> supplier() {
        System.out.println("supplier invoked!");
        return () -> {
            System.out.println("111111");
            return new ArrayList<>();
        };

    }

    @Override
    public BiConsumer<List<T>, T> accumulator() {
        System.out.println("accumulator invoked!");

        return (set, t) -> {
            System.out.println("accumulator:"+set+", "+Thread.currentThread().getName());
            set.add(t);
        };
    }

    @Override
    public BinaryOperator<List<T>> combiner() {
        System.err.println("combiner invoked!");
        return (set1, set2) -> {
            System.err.println("set1:"+set1);
            System.err.println("set2:"+set2);
            set1.addAll(set2);
            return set1;
        };
    }

    @Override
    public Function<List<T>, List<T>> finisher() {
        System.out.println("finisher invoked!");
        return (list) -> list  ;

    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoked!");
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.CONCURRENT));

    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "welcome", "hello", "a", "b", "c", "d", "e", "f", "g");


        System.out.println("list: " + list);

        //List<String> list2 = list.parallelStream().collect(new MySetCollector3<>());
        List<String> list2 = list.stream().collect(new MySetCollector3<>());


        System.out.println("list2:"+list2);
    }
}
