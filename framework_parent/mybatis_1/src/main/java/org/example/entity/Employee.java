package org.example.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class  Employee implements Serializable {
    private Integer id;
    private String empName;
    private Integer age;
    private String sex;
    private String email;
    private Department department;

    public Employee(Integer id, String empName, Integer age, String sex, String email) {
        this.id = id;
        this.empName = empName;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }
}
