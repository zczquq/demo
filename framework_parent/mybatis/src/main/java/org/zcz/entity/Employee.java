package org.zcz.entity;

import lombok.Data;

/**
 * @author 16339
 */
@Data
public class Employee {
    private Integer id;
    private String accountName;
    private String password;
    private String nickName;
    private String realName;
    private String sex;
    private String datetime;
    private String role;
    private Integer status;
    private Integer isDelete;
}
