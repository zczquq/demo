package org.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 员工信息表
 * @TableName employee
 */
@TableName(value ="employee")
@Data
public class Employee implements Serializable {
    /**
     * 员工主键ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 账户名
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
     *
     */
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", accountName=").append(accountName);
        sb.append(", password=").append(password);
        sb.append(", nickName=").append(nickName);
        sb.append(", realName=").append(realName);
        sb.append(", sex=").append(sex);
        sb.append(", hiredate=").append(hiredate);
        sb.append(", role=").append(role);
        sb.append(", status=").append(status);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
