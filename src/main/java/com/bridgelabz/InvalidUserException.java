package com.bridgelabz;

public class InvalidUserException extends Exception{
    public InvalidUserException(String message) {
        super(message);
    }

    public enum ExceptionType{
        NULL, EMPTY;
    }
    ExceptionType type;
    public InvalidUserException(ExceptionType type, String message){
        super(message);
        this.type = type;
    }
}
