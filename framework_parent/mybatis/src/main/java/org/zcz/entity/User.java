package org.zcz.entity;

import lombok.Data;

/**
 * @author 16339
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer isDelete;
}
