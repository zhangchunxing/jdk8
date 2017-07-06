package com.shengsiyuan.jdk8;

import java.util.Optional;

/**
 * Created by zhangchunxing on 2017/2/20.
 */
public class OptionalTest {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable("hello");
//        Optional<String> optional = Optional.of("Hello");
//        Optional<String> optional = Optional.empty();
//        if (optional.isPresent()) {
//            System.out.println(optional.get());
//        }
//        System.out.println(optional.get());
        optional.ifPresent((value) -> System.out.println(value));   //推荐Optional使用方式
        //下面两种方式我觉得在实际开发中，经常用到的场景就是判断对象是否为空，不为空则返回该对象否则返回我们定义的对象
        //以前开发中我们通常的做法是用三目运算符来判断赋值：String b = a != null ? a.toString(): "-"
        //或String b = !"".equals(a) ? a.toString() : "-";
        //现在我们可以用以下的方法代替：
        //Optional<String> op = Optional.ofNullable(a);
        //String b = op.orElse("-"); 或 String b = op.orElseGet(() -> "-";
        System.out.println(optional.orElse("world"));
        System.out.println(optional.orElseGet(() -> "nihao"));
    }
}
