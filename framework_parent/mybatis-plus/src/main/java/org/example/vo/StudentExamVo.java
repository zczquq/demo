package org.example.vo;

import lombok.Data;
import org.example.entity.Exam;

import java.util.List;

/**
 * 一对多映射关系
 * 一的一方要将属性拆出
 * @author 16339
 */
@Data
public class StudentExamVo {
    /**
     * 如果将学生数据映射到student就必须写association，就会变成一对一的映射
     * 无法将多个成绩数据放到一个List中去
     */
//    private Student student;
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private List<Exam> examList;
}
