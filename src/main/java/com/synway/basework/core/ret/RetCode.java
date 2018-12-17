package com.synway.basework.core.ret;

/**
 * @author cl 18222901084@163.com
 * @version V1.0
 * @Title: RetCode
 * @Package com.synway.basework.core.ret
 * @Description: TODO
 * @date 2018/12/17 21:53
 **/

public enum RetCode {
    // 成功
    SUCCESS(200),

    // 失败
    FAIL(400),

    // 未认证（签名错误）
    UNAUTHORIZED(401),

    // 接口不存在
    NOT_FOUND(404),

    // 服务器内部错误
    INTERNAL_SERVER_ERROR(500);

    public int code;

    RetCode(int code) {
        this.code = code;
    }

}
