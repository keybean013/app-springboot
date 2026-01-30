package com.example.api.exception;

import org.springframework.http.HttpStatus;

public abstract class ApiExceptionHandler extends RuntimeException{
    protected ApiExceptionHandler(String message){
        super(message);
    }

    abstract HttpStatus getStatus();
}
