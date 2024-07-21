package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.entity.Department;

public interface DepartmentMapper {
    /**
     * 分步查询员工及员工信息
     * 二：查询员工信息对应的部门信息
     * @param did
     * @return
     */
    Department getEmployeeAndDeptByStepTwo(@Param("did") Integer did);

    /**
     * 获取部门及下员工信息
     * @param did
     * @return
     */
    Department getDeptAndEmp(@Param("did") Integer did);

    /**
     * 分步查询查询部门以及部门下的员工信息
     * 分布查询一：查询部门信息
     * @param did
     * @return
     */
    Department getDeptAndEmpByStepOne(@Param("did") Integer did);
}
