package org.example.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.example.condition.EmployeeCondition;
import org.example.entity.Employee;

/**
 * @author 16339
 */
public interface IEmployeeService {

    /**
     * 插入一行
     * @param employee
     * @return
     */
    boolean save(Employee employee);

    /**
     * 更新任意一行的数据
     * @param employee
     * @return
     */
    boolean update(Employee employee);

    /**
     * 删除一行（真删除，假删除）
     * @param employee
     * @param logic true为真删除，false为假删除
     * @return
     */
    boolean remove(Employee employee, boolean logic);

    /**
     * 根据id查询一行详细信息
     * @param employee
     * @return
     */
    Employee detail(Employee employee);

    /**
     * 根据账户名查询一行详细信息
     * @param employee
     * @return
     */
    Employee login(Employee employee);

    /**
     * 任意条件+分页查询
     * @param condition
     * @param page
     * @return
     */
    Page<Employee> page (EmployeeCondition condition, Page<Employee> page);
}
