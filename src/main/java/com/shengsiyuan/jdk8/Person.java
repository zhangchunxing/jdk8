package com.shengsiyuan.jdk8;

/**
 * Created by zhangchunxing on 2017/2/12.
 */
public class Person {
    private String userName;
    private int age;

    public Person(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
