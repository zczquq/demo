package org.example.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author 16339
 */
@Data
@Entity(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "sex")
    private String sex;
    @Column(name = "age")
    private Integer age;
}
