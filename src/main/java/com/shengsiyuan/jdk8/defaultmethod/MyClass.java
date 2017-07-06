package com.shengsiyuan.jdk8.defaultmethod;

/**
 * Created by zhangchunxing on 2017/2/23.
 */
public class MyClass extends MyInterfaceImpl implements MyInterface2 {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myMethod(); //实现类的优先级比接口的优先级高
    }

}
