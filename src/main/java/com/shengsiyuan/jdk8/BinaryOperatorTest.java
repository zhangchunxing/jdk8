package com.shengsiyuan.jdk8;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * Created by zhangchunxing on 2017/2/18.
 */
public class BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperatorTest test1 = new BinaryOperatorTest();
        //加法运算
//        int result1 = test1.compute(2, 3, (value1 , value2) -> value1 + value2);
//        System.out.println(result1);
//        int result2 = test1.compute(2, 3, (value1 , value2) -> value1 - value2);
//        System.out.println(result2);
//        int result3 = test1.compute(2, 3, (value1 , value2) -> value1 * value2);
//        System.out.println(result3);
//        int result4 = test1.compute(9, 3, (value1 , value2) -> value1 / value2);
//        System.out.println(result4);
        Student student1 = new Student("zhangchunxing", 24);
        Student student2 = new Student("yangyang", 26);
        Student student = test1.comparatorByMin(student1, student2, ((o1, o2) -> {
                                if (o1.getAge() > o2.getAge()) return 1;
                                else if (o1.getAge() < o2.getAge()) return -1;
                                else return 0;
                            }));


        System.out.println(student.getName());
    }

    public int compute(Integer a, Integer b, BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(a, b);
    }

    public Student comparatorByMin(Student student1, Student student2,
                              Comparator<Student> comparator) {
        return BinaryOperator.minBy(comparator).apply(student1, student2);
    }
}
