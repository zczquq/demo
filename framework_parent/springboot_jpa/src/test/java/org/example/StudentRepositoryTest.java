package org.example;

import org.example.entity.Student;
import org.example.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author 16339
 */
@SpringBootTest
public class StudentRepositoryTest {
    @Resource
    StudentRepository studentRepository;

    @Test
    public void test() {
        Student student = new Student();
        student.setName("xxx");
        student.setSex("男");
        student.setAge(22);
        studentRepository.save(student);
    }
}
