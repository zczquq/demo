package org.zcz.entity;


import lombok.Data;

import java.util.List;

/**
 * @author 16339
 */
@Data
public class Student {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private List<Exam> exams;
}
