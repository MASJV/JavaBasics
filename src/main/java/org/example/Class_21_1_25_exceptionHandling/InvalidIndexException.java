package org.example.Class_21_1_25_exceptionHandling;

public class InvalidIndexException extends Exception{
    public InvalidIndexException(String message, Throwable cause){
        super(message, cause);
    }

    public InvalidIndexException(String message){
        super(message);
    }
}
