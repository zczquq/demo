package org.example.condition;

import lombok.Data;

import java.util.Date;

/**
 * @author 16339
 */
@Data
public class EmployeeCondition {
    String accountName;
    String password;
    String nickName;
    String realName;
    String sex;
    Date minDate;
    Date maxDate;
    String role;
    Integer status;
    Integer isDelete;
}
