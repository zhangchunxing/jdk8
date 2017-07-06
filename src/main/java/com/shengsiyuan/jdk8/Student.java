package com.shengsiyuan.jdk8;


/**
 * Created by zhangchunxing on 2017/2/18.
 */
public class Student {
    private String name = "zhangsan";
    private int age = 10;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
