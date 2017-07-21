package com.shengsiyuan.jdk8.joda;


import java.time.LocalDate;

/**
 * Created by zhangchunxing on 2017/7/21.
 */
public class Java8TimeTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear()+","+localDate.getMonthValue()+","+localDate.getDayOfMonth());

    }
}
