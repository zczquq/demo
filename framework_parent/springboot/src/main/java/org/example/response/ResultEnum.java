package org.example.response;

/**
 * @author 16339
 */
public enum ResultEnum {

    OK("10000", "操作成功"),
    ERROR("20000", "操作失败"),
    INSERT_ERROR("20001", "添加失败"),
    UPDATE_ERROR("20002", "更新失败"),
    DELETE_ERROR("20003", "删除失败"),
    DATA_NOT_FOUND("20004", "数据未找到"),
    INVALID_TOKEN("20005", "无效的token"),
    BLACK_IP("20006", "您已被拉入黑名单"),
    INVALID_CONTENT("20007", "非法的内容"),
    DATA_VALID_ERROR("20008", "校验失败"),
    FILE_UPLOAD_ERROR("20009", "文件上传失败"),
    FILE_OUT_MAX_SIZE("20010", "文件大小超过限制，单文件不超过200M，总大小不超过250M");

    private String code;
    private String message;

    ResultEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
