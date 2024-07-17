package org.example.entity;

import lombok.Data;

@Data
public class  Employee {
    private Integer id;
    private String empName;
    private Integer age;
    private String sex;
    private String email;
    private Department department;
}
