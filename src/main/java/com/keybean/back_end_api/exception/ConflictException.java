package com.keybean.back_end_api.exception;

import com.keybean.back_end_api.enums.ErrorCode;
import org.springframework.http.HttpStatus;

public class ConflictException extends ApiException{


    public ConflictException(ErrorCode errorCode) {
        super(resolveMessage(errorCode));
    }

    private static String resolveMessage(ErrorCode errorCode) {
        return switch (errorCode) {
            case USER_NOT_FOUND -> "User not found.";
            case ROLE_NOT_FOUND -> "Role not found.";
            case USER_ALREADY_EXISTS -> "User already exists.";
            case ROLE_ALREADY_EXISTS -> "Role already exists.";
            case NO_CHANGES_DETECTED -> "No changes detected.";
        };
    }


    @Override
    HttpStatus getStatus() {
        return HttpStatus.CONFLICT;
    }
}
