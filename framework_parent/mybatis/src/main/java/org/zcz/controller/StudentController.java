package org.zcz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zcz.entity.Student;
import org.zcz.entity.User;
import org.zcz.mapper.StudentMapper;

import javax.annotation.Resource;

/**
 * @author 16339
 */
@RestController
@RequestMapping("/stu")
public class StudentController {

    @Resource
    StudentMapper studentMapper;

    @GetMapping("/getStuById")
    public Student getUserById(Student student) {
        return studentMapper.selectUserById(student);
    }
}
