package com.bootdo.small;

/**
 * 错误码基类
 * 定义公共的错误码，每个具体模块的错误码要继承该类，以方便封装返回数据时可以直接调用：
 * <code>JsonResult getFailResult(SmallErrorMsg errorMsg);</code>
 *
 * @author likaige
 * @date 2017-06-06
 */
public class SmallErrorMsg {

    public static final SmallErrorMsg ERROR_SUCCESS = new SmallErrorMsg(0, "success");
    public static final SmallErrorMsg ERROR_AUTH_FAIL = new SmallErrorMsg(10010, "认证失败或者未登录");
    public static final SmallErrorMsg ERROR_CRACKPWD_FAIL = new SmallErrorMsg(1002, "解密失败");

    public static final SmallErrorMsg ERROR_SERIALIZE_EXCEPTION = new SmallErrorMsg(100001, "序列化异常");
    public static final SmallErrorMsg ERROR_UN_SERIALIZE_EXCEPTION = new SmallErrorMsg(100002, "反序列化异常");
    public static final SmallErrorMsg ERROR_API_FAIL = new SmallErrorMsg(100003, "接口请求失败");

    private int code;
    private String msg;

    public SmallErrorMsg() {
    }

    public SmallErrorMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public SmallErrorMsg setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public SmallErrorMsg setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
