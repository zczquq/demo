package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.example.entity.Employee;

/**
 * @author 16339
 */
public interface EmployeeMapper extends BaseMapper<Employee> {
    int logicDeleteById(@Param("em") Employee employee);
}
