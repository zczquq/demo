package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.example.entity.Employee;

/**
 * 员工映射
 * 继承官方BaseMapper，指定泛型为实体类
 * @author 16339
 */
public interface EmployeeMapper extends BaseMapper<Employee> {

    /**
     * 插入一行数据并返回自增长的主键
     * 自增长主键被保存在Employee对象中
     * @param employee
     * @return
     */
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    int insertAndReturnId(@Param("e") Employee employee);
}
