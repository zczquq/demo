package org.example.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.example.condition.StudentCondition;
import org.example.entity.Student;
import org.example.mapper.StudentMapper;
import org.example.service.IStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author 16339
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    StudentMapper studentMapper;

    @Resource
    IStudentService studentService;


    /**
     * 调用service层，service再调用mapper
     */
    @PostMapping("/save")
    public Object save(HttpServletRequest request, Student student) {
        studentService.save(request, student);
        return student;
    }

    @PostMapping("/update")
    public Object update(Student student) {
        studentService.update(student);
        return student;
    }

    @PostMapping("/remove")
    public Object remove(Student student) {
        studentService.remove(student);
        return student;
    }

    @PostMapping("/detail")
    public Object detail(Student student) {
        return studentService.detail(student);
    }

    @PostMapping("/page")
    public Object page(StudentCondition condition, Page<Student> page) {
        return studentService.page(condition, page);
    }


    //    /**
//     * 测试第一层controller直接调用第三层mapper
//     */
//    @PostMapping("/save")
//    public Object save(Student student) {
//        studentMapper.insert(student);
//        return student;
//    }
}
