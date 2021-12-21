package com.buraktuysuz.secondhomework.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsernamePhoneNotMatchException extends RuntimeException{

    public UsernamePhoneNotMatchException(String message){
        super(message);
    }
}
