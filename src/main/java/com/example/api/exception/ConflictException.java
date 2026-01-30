package com.example.api.exception;

import org.springframework.http.HttpStatus;

public class ConflictException extends ApiExceptionHandler{
    public ConflictException(String message) {
        super(message);
    }

    @Override
    HttpStatus getStatus() {
        return HttpStatus.CONFLICT;
    }
}
