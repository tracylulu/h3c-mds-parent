package com.h3c.mds.flowable.exception;

/**
 * 自定义流程异常
 */
public class FlowableException extends RuntimeException {

    public FlowableException() {
    }

    public FlowableException(String message) {
        super(message);
    }

    public FlowableException(String message, Throwable cause) {
        super(message, cause);
    }

    public FlowableException(Throwable cause) {
        super(cause);
    }

    public FlowableException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
