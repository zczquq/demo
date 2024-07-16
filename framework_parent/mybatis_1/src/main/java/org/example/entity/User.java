package org.example.entity;

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

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}
