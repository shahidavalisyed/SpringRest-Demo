package com.thinkconstructive.restdemo.exception;

import org.springframework.http.HttpStatus;

public class CloudVendorException {
    private final String message;
    private final Throwable throwble;
    private final HttpStatus httpStatus;

    public CloudVendorException(String message, Throwable throwble, HttpStatus httpStatus) {
        this.message = message;
        this.throwble = throwble;
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public Throwable getThrowble() {
        return throwble;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
