package org.example.Class_21_1_25_exceptionHandling;

public class InternalServerIssueException extends RuntimeException{
    public InternalServerIssueException(String message, Throwable cause){
        super(message, cause);
    }

    public InternalServerIssueException(String message){
        super(message);
    }
}
