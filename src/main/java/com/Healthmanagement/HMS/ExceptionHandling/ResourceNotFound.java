package com.Healthmanagement.HMS.ExceptionHandling;

public class ResourceNotFound extends RuntimeException {
    public ResourceNotFound(String message) {
        super(message);
    }
}
