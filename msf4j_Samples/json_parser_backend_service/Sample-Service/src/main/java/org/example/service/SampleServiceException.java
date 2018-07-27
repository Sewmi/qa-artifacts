package org.example.service;

public class SampleServiceException extends Exception{

    public SampleServiceException(String message){
        super(message);
    }

    public SampleServiceException(String message, Throwable cause){
        super(message, cause);
    }

}
