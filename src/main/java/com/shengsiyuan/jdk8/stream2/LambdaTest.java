package com.shengsiyuan.jdk8.stream2;

/**
 * Created by zhangchunxing on 2017/6/17.
 */
public class LambdaTest {
    Runnable r1 = () -> System.out.println(this);
    Runnable r2 = new Runnable() {
        @Override
        public void run() {
            System.out.println(this);
        }
    };

    public static void main(String[] args) {
        LambdaTest test = new LambdaTest();
        Thread t1 = new Thread(test.r1);
        t1.start();
        System.out.println("---------------------");
        Thread t2 = new Thread(test.r2);
        t2.start();
    }
}
