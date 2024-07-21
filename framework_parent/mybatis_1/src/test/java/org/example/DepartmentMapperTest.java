package org.example;

import org.example.mapper.DepartmentMapper;
import org.example.utils.SqlSessionUtils;
import org.junit.Test;

import java.io.IOException;

public class DepartmentMapperTest {

    /**
     * collection查询部门和部门里员工的信息
     * @throws IOException
     */
    @Test
    public void testGetDeptAndEmpById() throws IOException {
        DepartmentMapper departmentMapper = SqlSessionUtils.getSqlSession().getMapper(DepartmentMapper.class);
        System.out.println(departmentMapper.getDeptAndEmp(1));
    }

    @Test
    public void testGetDeptAndEmpById2() throws IOException {
        DepartmentMapper departmentMapper = SqlSessionUtils.getSqlSession().getMapper(DepartmentMapper.class);
        System.out.println(departmentMapper.getDeptAndEmpByStepOne(1));
    }
}
