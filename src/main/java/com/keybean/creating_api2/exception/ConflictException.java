package com.keybean.creating_api2.exception;

import org.springframework.http.HttpStatus;

public class ConflictException extends ApiException{

    public ConflictException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.CONFLICT;
    }
}
