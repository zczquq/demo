package org.example.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.example.condition.StudentCondition;
import org.example.entity.Student;
import org.example.mapper.StudentMapper;
import org.example.service.IStudentService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author 16339
 */
@Service
public class StudentServiceImpl implements IStudentService {
    @Resource
    StudentMapper studentMapper;
    @Override
    public boolean save(HttpServletRequest request, Student student) {
        return studentMapper.insert(student) > 0;
    }

    @Override
    public boolean update(Student student) {
        return studentMapper.updateById(student) > 0;
    }

    @Override
    public boolean remove(Student student) {
        return studentMapper.deleteById(student) > 0;
    }

    @Override
    public Student detail(Student student) {
        return studentMapper.selectById(student.getId());
    }

    @Override
    public Page<Student> page(StudentCondition studentCondition, Page<Student> page) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.like(StringUtils.hasText(studentCondition.getName()), "name", studentCondition.getName());
        queryWrapper.eq(StringUtils.hasText(studentCondition.getSex()), "sex", studentCondition.getSex());
        queryWrapper.eq(studentCondition.getAge() != null, "age", studentCondition.getAge());
        queryWrapper.ge(studentCondition.getMinAge() != null, "age", studentCondition.getMinAge());
        queryWrapper.le(studentCondition.getMaxAge() != null, "age", studentCondition.getMaxAge());
        queryWrapper.between(studentCondition.getMinAge() != null && studentCondition.getMaxAge() != null,
                "age", studentCondition.getMinAge(),studentCondition.getMaxAge());
        return studentMapper.selectPage(page, queryWrapper);
    }
}
