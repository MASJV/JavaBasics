package org.example.Class_21_1_25_exceptionHandling;

public class DataNotFoundException extends Exception{
    public DataNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataNotFoundException(String message) {
        super(message);
    }
}
