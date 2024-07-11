package org.example.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.example.condition.EmployeeCondition;
import org.example.entity.Employee;
import org.example.mapper.EmployeeMapper;
import org.example.service.IEmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * @author 16339
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Resource
    EmployeeMapper employeeMapper;

    @Override
    public boolean save(Employee employee) {
        return employeeMapper.insert(employee) > 0;
    }

    @Override
    public boolean update(Employee employee) {
        return employeeMapper.updateById(employee) > 0;
    }

    @Override
    public boolean remove(Employee employee, boolean logic) {
        if (logic) {
            return employeeMapper.deleteById(employee) > 0;
        } else {
            return employeeMapper.logicDeleteById(employee) > 0;
        }
    }

    @Override
    public Employee detail(Employee employee) {
        return employeeMapper.selectById(employee.getId());
    }

    @Override
    public Employee login(Employee employee) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq(StringUtils.hasText(employee.getAccountName()), "account_name", employee.getAccountName());
        return employeeMapper.selectOne(queryWrapper);
    }

    @Override
    public Page<Employee> page(EmployeeCondition condition, Page<Employee> page) {
        QueryWrapper qw = new QueryWrapper();
        qw.like(StringUtils.hasText(condition.getAccountName()), "account_name", condition.getAccountName());
        qw.eq(StringUtils.hasText(condition.getPassword()), "password", condition.getPassword());
        qw.like(StringUtils.hasText(condition.getNickName()), "nick_name", condition.getNickName());
        qw.like(StringUtils.hasText(condition.getRealName()), "real_name", condition.getRealName());
        qw.eq(StringUtils.hasText(condition.getSex()), "sex", condition.getSex());
        qw.ge(condition.getMinDate() != null, "hiredate",  condition.getMinDate());
        qw.le(condition.getMaxDate() != null, "hiredate", condition.getMaxDate());
        qw.between(condition.getMinDate() != null && condition.getMaxDate() != null, "hiredate", condition.getMinDate(), condition.getMaxDate());
        qw.like(StringUtils.hasText(condition.getRole()), "role", condition.getRole());
        qw.eq(condition.getStatus() != null, "status", condition.getStatus());
        qw.eq(condition.getStatus() != null, "is_delete", condition.getIsDelete());
        return employeeMapper.selectPage(page, qw);
    }
}
