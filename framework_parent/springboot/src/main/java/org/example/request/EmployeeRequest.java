package org.example.request;

import lombok.Data;

import javax.validation.constraints.*;

/**
 * @author 16339
 */
@Data
public class EmployeeRequest {
    @NotBlank(message = "name must not null")
    private String name;
    @NotBlank(message = "sex must not null")
    private String sex;
    @NotBlank(message = "birthday must not null")
    private String birthday;
    @NotNull(message = "id must not null")
    private Integer id;
    @Email
    private String email;
    @NotNull
    @Digits(integer = 2, fraction = 2, message = "数字格式不正确，必须是最多2位整数和2位小数的数字")
    private Double number;
    @NotBlank(message = "身份证不能为空")
    @Pattern(regexp = "^\\\\d{17}[\\\\dXx]$", message = "身份证格式错误")
    private String idNumber;
}
