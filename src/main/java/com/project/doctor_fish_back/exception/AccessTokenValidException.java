package com.project.doctor_fish_back.exception;

public class AccessTokenValidException extends RuntimeException {

    public AccessTokenValidException(String message) {
        super(message);
    }
}
