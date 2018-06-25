package com.getick.exception;

/**
 * Demo class
 *
 * @author ikuacc
 * Created on 2018/4/2
 */
public class SsrcoException extends RuntimeException {
    /**
     * 错误码
     */
    private String code;
    /**
     * 错误码对应的参数
     */
    private Object[] args;
    /**
     * 错误消息
     */
    private String defaultMessage;

    public SsrcoException() {
    }

    public SsrcoException(String message) {
        super(message);
    }

    public SsrcoException(String message, Throwable cause) {
        super(message, cause);
    }

    public SsrcoException(Throwable cause) {
        super(cause);
    }
}
