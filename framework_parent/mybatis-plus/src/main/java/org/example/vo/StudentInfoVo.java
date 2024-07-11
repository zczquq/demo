package org.example.vo;

import lombok.Data;
import org.example.entity.Student;
import org.example.entity.StudentInfo;

/**
 * @author 16339
 */
@Data
public class StudentInfoVo {
    private Student student;
    private StudentInfo studentInfo;
}
