package com.h3c.mds.finance.exception;

/**
 * 财务信息自定义异常
 */
public class FinanceException extends RuntimeException{

    public FinanceException() {
    }

    public FinanceException(String message) {
        super(message);
    }

    public FinanceException(String message, Throwable cause) {
        super(message, cause);
    }

    public FinanceException(Throwable cause) {
        super(cause);
    }

    public FinanceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
