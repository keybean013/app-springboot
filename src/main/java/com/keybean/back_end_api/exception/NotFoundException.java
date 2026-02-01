package com.keybean.back_end_api.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends ApiException{
    public NotFoundException(String message) {
        super(message);
    }

    @Override
    HttpStatus getStatus() {
        return HttpStatus.NOT_FOUND;
    }
}
