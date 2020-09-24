package com.h3c.mds.flowable.exception;

@SuppressWarnings("serial")
public class ProjectCodeDraftException  extends RuntimeException {

	public ProjectCodeDraftException() {
    }

    public ProjectCodeDraftException(String message) {
        super(message);
    }

    public ProjectCodeDraftException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProjectCodeDraftException(Throwable cause) {
        super(cause);
    }

    public ProjectCodeDraftException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
