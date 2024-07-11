package org.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author 16339
 */
@Data
public class Employee {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String accountName;
    private String password;
    private String nickName;
    private String realName;
    private String sex;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hiredate;
    private String role;
    private Integer status;
    private Integer isDelete;
}
