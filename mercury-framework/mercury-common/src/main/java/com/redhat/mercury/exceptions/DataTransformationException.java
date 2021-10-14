package com.redhat.mercury.exceptions;

public class DataTransformationException extends Exception {

    public DataTransformationException(String message) {
        super(message);
    }

    public DataTransformationException(String message, Throwable t) {
        super(message, t);
    }

    public DataTransformationException(Throwable t) {
        super(t);
    }
}
