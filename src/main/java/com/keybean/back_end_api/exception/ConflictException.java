package com.keybean.back_end_api.exception;

import org.springframework.http.HttpStatus;

public class ConflictException extends ApiException{

    public ConflictException(String message) {
        super(message);
    }

    @Override
    HttpStatus getStatus() {
        return HttpStatus.CONFLICT;
    }
}
