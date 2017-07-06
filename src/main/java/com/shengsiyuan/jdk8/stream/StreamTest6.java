package com.shengsiyuan.jdk8.stream;

import java.util.IntSummaryStatistics;
import java.util.UUID;
import java.util.stream.Stream;

/**
 * Created by zhangchunxing on 2017/3/5.
 */
public class StreamTest6 {
    public static void main(String[] args) {
//        Stream stream = Stream.generate(UUID.randomUUID()::toString);
//        System.out.println(stream.findFirst().get());
//        stream.findFirst().ifPresent(System.out::println);
        Stream<Integer> stream = Stream.iterate(1, item -> item + 2).limit(6);
//        int r = Stream.iterate(1, item -> item + 2).limit(6)
//                    .filter(t -> t > 2)
//                    .mapToInt(value -> value * 2)
//                    .skip(2)
//                    .limit(2)
//                    .min().getAsInt();
//        System.out.println(r);

//        IntSummaryStatistics summaryStatistics = Stream.iterate(1, item -> item + 2).limit(6).filter(t -> t > 2).mapToInt(value -> value * 2).skip(2).limit(2).summaryStatistics();
//        summaryStatistics.getSum();
        System.out.println(stream);
        System.out.println(stream.filter(t -> t > 2));
        System.out.println(stream.distinct());
    }
}
