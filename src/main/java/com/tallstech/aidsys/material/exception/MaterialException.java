package com.tallstech.aidsys.material.exception;


import static com.tallstech.aidsys.material.exception.ErrorMessages.DEFAULT_ERROR_MESSAGE;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;

@Getter
@Setter
public class MaterialException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String detail;
    @NotNull
    private final HttpStatus status;

    protected MaterialException(HttpStatus status, Throwable throwable) {
        super(status.name(), throwable);
        this.status = status;
        this.message = throwable.getMessage();
        this.detail = !StringUtils.hasText(throwable.getMessage()) ? throwable.getMessage() : DEFAULT_ERROR_MESSAGE;
    }

    protected MaterialException(HttpStatus status, String message) {
        super(status.name());
        this.status = status;
        this.message = message;
        this.detail = null;
    }

    protected MaterialException(HttpStatus status, String message, String errorDetail) {
        super(status.name());
        this.status = status;
        this.message = message;
        this.detail = errorDetail;
    }

    public static MaterialException withStatusAndThrowable(HttpStatus status, Throwable throwable){
        return new MaterialException(status, throwable);
    }

    public static MaterialException withStatusAndMessage(HttpStatus status, String message){
        return new MaterialException(status, message);
    }

    public static MaterialException withStatusAndDetails(HttpStatus status, String message, String errorDetail){
        return new MaterialException(status, message, errorDetail);
    }
}
