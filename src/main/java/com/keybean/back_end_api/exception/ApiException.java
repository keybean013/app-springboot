package com.keybean.back_end_api.exception;

import org.springframework.http.HttpStatus;

public abstract class ApiException extends RuntimeException{

    public ApiException(String message) {
        super(message);
    }

    abstract HttpStatus getStatus();
}
