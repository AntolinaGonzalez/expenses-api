package com.project.expensesapi.data.error;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ApiError {

    INTERNAL_ERROR(500, "Internal Error", HttpStatus.INTERNAL_SERVER_ERROR),
    TOO_MANY_REQUESTS(429, "Too many requests", HttpStatus.TOO_MANY_REQUESTS),
    BAD_REQUEST(400, "Bad request", HttpStatus.BAD_REQUEST),
    NOT_FOUND(404, "Not found", HttpStatus.NOT_FOUND),
    UNPROCESSABLE_ENTITY(422, "Unprocesable entity", HttpStatus.UNPROCESSABLE_ENTITY);
    private final int code;
    private final String message;
    private final HttpStatus statusCode;

    ApiError(final int code, final String message, final HttpStatus statusCode) {
        this.code = code;
        this.message = message;
        this.statusCode = statusCode;
    }

}
