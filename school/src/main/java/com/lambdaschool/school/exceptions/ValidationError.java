package com.lambdaschool.school.exceptions;

public class ValidationError
{
    // fields
    private String code;
    private String message;

    // default constructor
    public ValidationError()
    {

    }

    // constructor
    public ValidationError(String code, String message)
    {
        this.code = code;
        this.message = message;
    }

    // getters and setters
    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    // toString
    @Override
    public String toString() {
        return "ValidationError{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
