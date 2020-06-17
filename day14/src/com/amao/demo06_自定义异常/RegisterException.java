package com.amao.demo06_自定义异常;

/**
 * 注册异常:用来描述用户名已经存在这种情况的异常
 */
public class RegisterException extends Exception{
    public RegisterException() {
    }
    public RegisterException(String message) {
        super(message);
    }
}
