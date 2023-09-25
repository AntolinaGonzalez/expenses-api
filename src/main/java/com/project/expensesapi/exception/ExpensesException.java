package com.project.expensesapi.exception;

import com.project.expensesapi.data.error.ApiError;
import lombok.Getter;

@Getter
public class ExpensesException extends RuntimeException{
    private final ApiError error;
    private final String message;

    public ExpensesException(final ApiError error) {
        super(error.getMessage());
        this.error = error;
        this.message = error.getMessage();
    }

    public ExpensesException(final ApiError error, final String message) {
        super(message);
        this.error = error;
        this.message = message;
    }
}
