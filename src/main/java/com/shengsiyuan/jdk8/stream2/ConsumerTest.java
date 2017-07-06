package com.shengsiyuan.jdk8.stream2;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/**
 * Created by zhangchunxing on 2017/5/24.
 */
public class ConsumerTest {
    public void test(Consumer<? super Integer> consumer) {
        System.out.println("consumer");
        consumer.accept(1000);
    }
    public void test(IntConsumer intConsumer) {
        System.out.println("intConsumer");
        intConsumer.accept(100);
    }

    public  boolean isTest(Consumer<? super Integer> consumer) {
        return consumer instanceof Consumer;
    }

    public  boolean isTest(IntConsumer intConsumer ) {
        return intConsumer instanceof IntConsumer;
    }

    public static void main(String[] args) {
        ConsumerTest consumerTest = new ConsumerTest();

        Consumer<? super Integer> consumer = i -> System.out.println(i);
        IntConsumer intConsumer = i -> System.out.println(i);

//        System.out.println(consumer instanceof IntConsumer);
//        System.out.println(intConsumer instanceof Consumer);
//        System.out.println(intConsumer instanceof  IntConsumer);

        System.out.println(consumerTest.isTest((IntConsumer) i -> System.out.println(i)));
        //System.out.println(consumerTest.isTest(i -> System.out.println(i)));
        System.out.println(consumerTest.isTest((IntConsumer) consumer));


        //consumerTest.test(consumer); //面向对象方式
        consumerTest.test(intConsumer);
        consumerTest.test((IntConsumer) consumer::accept); //函数式方式
        consumerTest.test((IntConsumer) intConsumer::accept); //函数式方式
        consumerTest.test(consumer);
        consumerTest.test((Consumer<? super Integer>) consumer::accept);
    }
}
