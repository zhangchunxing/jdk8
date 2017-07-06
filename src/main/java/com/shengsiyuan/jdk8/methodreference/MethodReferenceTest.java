package com.shengsiyuan.jdk8.methodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by zhangchunxing on 2017/2/22.
 */
public class MethodReferenceTest {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 90);
        Student student2 = new Student("lisi", 40);
        Student student3 = new Student("wangwu", 80);
        Student student4 = new Student("zhaoliu", 60);

//        List<Student> students = Arrays.asList(student1, student2, student3, student4);
//        students.sort((a, b) -> Student.compareStudentByScore(a, b));
//        students.forEach(item -> System.out.println(item.getName()));
//
//        System.out.println("--------------------");

//        students.sort(Student::compareStudentByScore);
//        students.forEach(item -> System.out.println(item.getName()));

//        students.sort(Student::compareByName);
//        List<String> cities = Arrays.asList("shanghai", "tianjin", "chongqing", "beijing");
//
//        Collections.sort(cities, String::compareToIgnoreCase);

        MethodReferenceTest tt = new MethodReferenceTest();
        System.out.println(tt.getString(String::new));
        System.out.println(tt.getString2("hello", String::new));
    }

    String getString(Supplier<String> suppplier) {
        return suppplier.get() + "test";
    }

    String getString2(String str, Function<String, String> function) {
        return function.apply(str);
    }
}
