package com.vv.common.enums;

/**
 * 错误码
 */
public enum ResponseCode {

    SUCCESS(0, "ok"),
    PARAMS_ERROR(40000, "请求参数错误"),
    NOT_LOGIN_ERROR(40100, "未登录"),
    ILLEGAL_ERROR(40301, "请求非法"),
    NO_AUTH_ERROR(40101, "无权限"),
    NOT_FOUND_ERROR(40400, "请求数据不存在"),
    FORBIDDEN_ERROR(40300, "禁止访问"),
    SYSTEM_ERROR(50000, "系统内部异常"),
    OPERATION_ERROR(50001, "操作失败"),
    SMS_CODE_ERROR(50002,"验证码或手机号错误"),
    EMAIL_ERROR(50003,"邮箱错误"),
    PASSWORD_NO_MATCH_ERROR(50004,"两次密码不一致"),
    USER_EXIST_ERROR(50005,"用户已存在"),
    PASSWORD_ERROR(50006,"密码错误"),
    REGISTER_ERROR(50007,"注册失败");

    /**
     * 状态码
     */
    private final int code;

    /**
     * 信息
     */
    private final String message;

    ResponseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
