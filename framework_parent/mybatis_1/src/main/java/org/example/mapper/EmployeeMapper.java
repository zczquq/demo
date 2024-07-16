package org.example.mapper;

import org.example.entity.Employee;

import java.util.List;

public interface EmployeeMapper {
    /**
     * 查询所有员工信息
     * @return
     */
    List<Employee> selectAllEmployee();


}
