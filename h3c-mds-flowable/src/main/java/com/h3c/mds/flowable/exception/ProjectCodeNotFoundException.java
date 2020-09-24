package com.h3c.mds.flowable.exception;

@SuppressWarnings("serial")
public class ProjectCodeNotFoundException  extends RuntimeException {

	public ProjectCodeNotFoundException() {
    }

    public ProjectCodeNotFoundException(String message) {
        super(message);
    }

    public ProjectCodeNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProjectCodeNotFoundException(Throwable cause) {
        super(cause);
    }

    public ProjectCodeNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
