package com.amao.demo06_自定义异常;

/**
 * 自定义异常
 */
public class MyException extends /*Exception*/RuntimeException {
    /**
     * 无参构造
     */
    public MyException() {
    }
    /**
     * 带有异常信息的构造
     * @param message 异常信息
     */
    public MyException(String message) {
        super(message);
    }
}
