package org.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author 16339
 */
@Data
public class Employee {
    /**
     * 员工id
     * 使用TableId修改主键的生成策略，设置使用数据库设置的自增长主键
     * 前提是数据库表要有自增长主键
     * type取值是IdType枚举类中的枚举值
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 员工账号
     */
    private String accountName;
    /**
     * 员工密码
     */
    private String password;
    /**
     * 系统昵称
     */
    private String nickName;
    /**
     * 员工真实姓名
     */
    private String realName;
    /**
     * 员工性别
     */
    private String sex;
    /**
     * 入职日期
     */
    private Date hiredate;
    /**
     * 员工角色
     */
    private String role;
    /**
     * 员工状态
     */
    private Integer status;

    /**
     * 忽略表中不存在的字段
     */
    @TableField(exist = false)
    private String token;
}
