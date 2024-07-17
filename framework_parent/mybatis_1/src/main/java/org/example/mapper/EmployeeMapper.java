package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.entity.Employee;

import java.util.List;

public interface EmployeeMapper {
    /**
     * 查询所有员工信息
     * @return
     */
    List<Employee> selectAllEmployee();

    /**
     * 查询员工以及员工对应的部门信息
     * @param eid
     * @return
     */
    Employee getEmployeeAndDeptById(@Param("eid") Integer eid);

    /**
     * 分步查询员工及员工信息
     * 一：查询员工信息
     * @param eid
     * @return
     */
    Employee getEmployeeAndDeptByStepOne(@Param("eid") Integer eid);
}
