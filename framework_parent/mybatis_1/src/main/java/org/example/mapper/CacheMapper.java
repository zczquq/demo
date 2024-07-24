package org.example.mapper;

import org.example.entity.Employee;

public interface CacheMapper {

    /**
     * 获取员工对象
     * @param eid
     * @return
     */
    Employee getEmployeeById(Integer eid);

    /**
     * 根据eid删除员工
     * @param eid
     * @return
     */
    int deleteEmployeeById(Integer eid);
}
