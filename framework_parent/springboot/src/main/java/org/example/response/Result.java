package org.example.response;

import lombok.Data;

/**
 * @author 16339
 */
@Data
public class Result<T> {
    private String code;
    private String message;
    private T data;

    /**
     * 返回默认的成功
     * @return
     * @param <T>
     */
    public static <T> Result<T> success() {
        return success(null);
    }

    public static <T> Result<T> success(T data) {
        Result result = new Result();
        result.setCode(ResultEnum.OK.getCode());
        result.setMessage(ResultEnum.OK.getMessage());
        result.setData(data);
        return result;
    }

    public static Result error() {
        return error(ResultEnum.ERROR.getCode(), ResultEnum.ERROR.getMessage());
    }

    public static Result error(ResultEnum resultEnum) {
        return error(resultEnum.getCode(), resultEnum.getMessage());
    }

    public static Result error(String code, String message) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        result.setData(null);
        return result;
    }
}
