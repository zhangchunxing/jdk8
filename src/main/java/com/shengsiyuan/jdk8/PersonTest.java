package com.shengsiyuan.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

/**
 * Created by zhangchunxing on 2017/2/12.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("zhangsan", 20);
        Person person2 = new Person("lisi", 30);
        Person person3 = new Person("wangwu", 40);

        List<Person> list = Arrays.asList(person1, person2, person3);

        PersonTest test = new PersonTest();
//        List<Person> result = test.getPersonByUserName("zhangsan", list);
//        result.forEach(person -> System.out.println(person.getUserName()));
//        List<Person> result = test.getPersonByAge(20, list);
//        result.forEach(person -> System.out.println(person.getAge()));

        List<Person> result = test.getPersonByAge2(20, list, (age, persons) -> {
            return persons.stream().filter(person -> person.getAge() > age)
                    .collect(Collectors.toList());
        });

        result.forEach(item -> System.out.println(item.getAge()));
    }

    public List<Person> getPersonByUserName(String userName, List<Person> persons) {
        return persons.stream().filter((person -> person.getUserName().equals(userName)))
                .collect(Collectors.toList());
    }

    public  List<Person> getPersonByAge(int age, List<Person> persons) {
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (value1, value2) ->
            value2.stream().filter(person -> person.getAge() > value1)
                    .collect(Collectors.toList());

        return biFunction.apply(age, persons);
    }

    public List<Person> getPersonByAge2(int age, List<Person> persons, BiFunction<Integer, List<Person>, List<Person>> biFunction) {
        return biFunction.apply(age, persons);
    }
}
