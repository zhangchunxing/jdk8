package com.shengsiyuan.jdk8;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Created by zhangchunxing on 2017/2/21.
 */
public class OptionalTest2 {
    public static void main(String[] args) {
        Employee emplyee1 = new Employee();
        emplyee1.setName("zhangsan");
        Employee employee2 = new Employee();
        employee2.setName("lisi");

        Company company = new Company();
        company.setName("shengsiyuan");
        List<Employee> empoyees = Arrays.asList(emplyee1, employee2);
        //company.setEmplyees(empoyees);

        List<Employee> list = company.getEmplyees();

        Optional<Company> optional = Optional.ofNullable(company);
        System.out.println(optional.map(value -> value.getEmplyees()).orElse(Collections.emptyList()));
    }
}
