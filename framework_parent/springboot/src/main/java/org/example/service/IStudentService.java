package org.example.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.example.condition.StudentCondition;
import org.example.entity.Student;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 16339
 */
public interface IStudentService {
    boolean save(HttpServletRequest request, Student student);

    boolean update(Student student);

    boolean remove(Student student);

    Student detail(Student student);

    Page<Student> page (StudentCondition studentCondition, Page<Student> page);
}
