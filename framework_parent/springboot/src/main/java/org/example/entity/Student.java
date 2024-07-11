package org.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author 16339
 */
@Data
public class Student {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
}
