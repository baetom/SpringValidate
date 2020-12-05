package com.example.validate.exvalidate.result;

import lombok.Data;

@Data
public class CustomInvalidParameterException extends Throwable {

    /**
     *
     */
    private static final long serialVersionUID = 8769389874458588957L;
    private String message;

    public CustomInvalidParameterException(String message) {
        this.message = message;
    }

    // public CustomInvalidParameterException(String message) {
    // this.setMessage(message);
    // }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
