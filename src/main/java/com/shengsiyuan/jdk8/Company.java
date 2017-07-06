package com.shengsiyuan.jdk8;

import java.util.List;

/**
 * Created by zhangchunxing on 2017/2/21.
 */
public class Company {
    private String name;
    private List<Employee> emplyees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmplyees() {
        return emplyees;
    }

    public void setEmplyees(List<Employee> emplyees) {
        this.emplyees = emplyees;
    }
}
