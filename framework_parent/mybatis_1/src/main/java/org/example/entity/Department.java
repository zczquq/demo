package org.example.entity;

import lombok.Data;

import java.util.List;

@Data
public class Department {
    private int id;
    private String name;
    /**
     * 多对一关系中的一
     * 部门类中设置员工集合
     */
    private List<Employee> employees;
}
