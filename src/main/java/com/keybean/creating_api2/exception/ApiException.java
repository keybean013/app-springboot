package com.keybean.creating_api2.exception;

import org.springframework.http.HttpStatus;

public abstract class ApiException extends RuntimeException {

    protected ApiException(String message) {
        super(message);
    }

    public abstract HttpStatus getStatus();

}
