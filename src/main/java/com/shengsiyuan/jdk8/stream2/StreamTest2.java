package com.shengsiyuan.jdk8.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by zhangchunxing on 2017/5/7.
 */
public class StreamTest2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");

        try(Stream<String> st = list.stream()) {
            st.onClose(()->{
                System.out.println("aaa");
            }).onClose(()-> {
                System.out.println("bbb");
            }).forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
