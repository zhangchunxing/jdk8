package com.shengsiyuan.jdk8.stream2;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
/**
 * Created by zhangchunxing on 2017/3/14.
 */
public class StreamTest1 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 80);
        Student student2 = new Student("lisi", 90);
        Student student3 = new Student("wangwu", 100);
        Student student4 = new Student("zhaoliu", 90);
        Student student5 = new Student("zhaoliu", 50);

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5);
        List<Student> students1 = students.stream().collect(toList());
        students1.forEach(System.out::println);

        System.out.println("--------------------");

        System.out.println("count: " + students.stream().collect(counting()));
        System.out.println("count: " + students.stream().count());

        System.out.println("--------------------");

        System.out.println("min:" + students.stream().min((s1, s2) -> s1.getScore() - s2.getScore()));
        students.stream().collect(minBy(Comparator.comparingInt(Student::getScore))).ifPresent(System.out::println);
        System.out.println( students.stream().collect(summarizingInt(Student::getScore)));

        System.out.println("join:" + students.stream().map(Student::getName).collect(joining("/", "<begin>", "<end>")));

        System.out.println("--------------------");

        Map<Integer, Map<String, List<Student>>> map = students.stream().collect(groupingBy(Student::getScore, groupingBy(Student::getName)));
        System.out.println(map);
        Map<Boolean, Map<Boolean, List<Student>>> map2 = students.stream().collect(partitioningBy((item) -> item.getScore() > 80, partitioningBy((item)-> item.getScore() > 90)));
        System.out.println(map2);
        System.out.println("---------444-----------");
        Map<String, Student> map5 = students.stream().collect(groupingBy(Student::getName,
                collectingAndThen(minBy(Comparator.comparingInt(Student::getScore)),
                        Optional::get)));

        System.out.println(map5);
    }



}
