package org.example.Class_21_1_25_exceptionHandling;

public class EmptyLinkedListException extends Exception{ //runtime or runtime exception(difference see)

    public EmptyLinkedListException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyLinkedListException(String message) {
        super(message);
    }
}
