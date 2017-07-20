package com.shengsiyuan.jdk8.joda;

import org.joda.time.DateTime;

/**
 * Created by zhangchunxing on 2017/7/18.
 */
public class JodaTest2 {
    public static void main(String[] args) {
        DateTime dateTime = new DateTime();
        DateTime tomorrow = dateTime.plusDays(1);
        System.out.println(tomorrow.toString("yyyy-MM-dd"));

        DateTime yy = dateTime.withDayOfMonth(1);
        System.out.println(yy.toString());
        DateTime yy2 = dateTime.dayOfMonth().withMinimumValue();
        System.out.println(yy2.toString());

    }
}
