package com.bootdo.app;

/**
 * 错误码基类
 * 定义公共的错误码，每个具体模块的错误码要继承该类，以方便封装返回数据时可以直接调用：
 * <code>JsonResult getFailResult(AppErrorMsg errorMsg);</code>
 *
 * @author likaige
 * @date 2017-06-06
 */
public class AppErrorMsg {

    public static final AppErrorMsg ERROR_SUCCESS = new AppErrorMsg(0, "success");
    public static final AppErrorMsg ERROR_AUTH_FAIL = new AppErrorMsg(10010, "认证失败或者未登录");
    public static final AppErrorMsg ERROR_CRACKPWD_FAIL = new AppErrorMsg(1002, "解密失败");

    public static final AppErrorMsg ERROR_SERIALIZE_EXCEPTION = new AppErrorMsg(100001, "序列化异常");
    public static final AppErrorMsg ERROR_UN_SERIALIZE_EXCEPTION = new AppErrorMsg(100002, "反序列化异常");
    public static final AppErrorMsg ERROR_API_FAIL = new AppErrorMsg(100003, "接口请求失败");

    private int code;
    private String msg;

    public AppErrorMsg() {
    }

    public AppErrorMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public AppErrorMsg setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AppErrorMsg setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
