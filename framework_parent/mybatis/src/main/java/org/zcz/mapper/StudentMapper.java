package org.zcz.mapper;

import org.zcz.entity.Student;


/**
 * @author 16339
 */
public interface StudentMapper {
    Student selectUserById(Student student);
}
