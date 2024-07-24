package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.entity.Employee;

import java.util.List;

public interface DynamicSQLMapper {


    List<Employee> getEmployeeByCondition(Employee employee);

    List<Employee> getEmployeeByConditionWhere(Employee employee);

    List<Employee> getEmployeeByConditionTrim(Employee employee);

    /**
     * 测试choose、when、otherwise
     * @param employee
     * @return
     */
    List<Employee> getEmployeeByChoose(Employee employee);

    /**
     * 通过foreach批量删除数据
     * @param eids
     * @return
     */
    int deleteMoreByArray(@Param("eids") Integer[] eids);

    /**
     * 通过list集合实现批量添加
     * @param employees
     * @return
     */
    int insertMoreByList(@Param("employees") List<Employee> employees);


}
