package com.amit.exception;

import com.amit.model.ErrorCode;
import org.springframework.http.HttpStatus;

public class ApplicationCustomException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private static ErrorCode errorCode;
    private static HttpStatus statusCode;


    public ApplicationCustomException(String message) {
        super(message);
        this.statusCode = HttpStatus.INTERNAL_SERVER_ERROR;
    }


    public ApplicationCustomException(String message, HttpStatus statusCode) {
        super(message);
        this.statusCode = statusCode;
    }


    public HttpStatus getStatusCode() {
        return statusCode;
    }


    public ErrorCode getErrorCode() {
        return errorCode;
    }


}
