package com.shengsiyuan.jdk8.joda;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;

import java.util.Date;

/**
 * Created by zhangchunxing on 2017/7/20.
 */
public class JodaTest3 {
    //标准UTC时间：2014-11-14T09:22:54.876Z(+08:00)
    public static Date convertUTC2Date(String utcDate) {
        DateTime dateTime = DateTime.parse(utcDate, DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
        return dateTime.toDate();
    }

    public static String convertDate2UTC(DateTime javaDate) {
        DateTime dateTime = new DateTime(javaDate, DateTimeZone.UTC);
        return  dateTime.toString();
    }

    public static String convertDate2LocalByDateFormat(Date date, String dateFormat) {
        DateTime dateTime = new DateTime(date);
        return  dateTime.toString(dateFormat);
    }

    public static void main(String[] args) {

    }

}
