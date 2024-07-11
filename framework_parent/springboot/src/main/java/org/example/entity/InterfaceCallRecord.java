package org.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * @author 16339
 */
@Data
public class InterfaceCallRecord {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String interfaceName;
    private Long startCallTime;
    private Long endCallTime;
    /**
     * 接口的调用时间
     */
    private Long duration;
    /**
     * 调用这个接口是否抛出了异常，没有为0，有异常为1
     */
    private Integer hasError;

    private String requestIp;
    private String url;
    private String method;
    private String errorMessage;
}
