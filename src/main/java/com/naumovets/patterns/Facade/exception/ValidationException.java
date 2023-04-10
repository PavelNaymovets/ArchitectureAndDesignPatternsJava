package com.naumovets.patterns.Facade.exception;

import java.util.List;
import java.util.stream.Collectors;

public class ValidationException extends RuntimeException {
    private List<String> errorMessage;

    public ValidationException(List<String> errorMessage) {
        super(errorMessage.stream().collect(Collectors.joining(",")));
        this.errorMessage = errorMessage;
    }
}
