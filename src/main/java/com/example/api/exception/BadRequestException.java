package com.example.api.exception;

import org.springframework.http.HttpStatus;

public class BadRequestException extends ApiExceptionHandler{
    public BadRequestException(String message) {
        super(message);
    }

    @Override
    HttpStatus getStatus() {
        return HttpStatus.BAD_REQUEST;
    }


}
