package com.example.api.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends ApiExceptionHandler{
    public NotFoundException(String message) {
        super(message);
    }

    @Override
    HttpStatus getStatus() {
        return HttpStatus.NOT_FOUND;
    }
}
