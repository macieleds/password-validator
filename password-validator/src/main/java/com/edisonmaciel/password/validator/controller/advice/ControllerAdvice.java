package com.edisonmaciel.password.validator.controller.advice;

import com.edisonmaciel.password.validator.controller.exceptions.StandardError;
import com.edisonmaciel.password.validator.controller.exceptions.response.PasswordResponseCode;
import com.edisonmaciel.password.validator.controller.exceptions.response.PasswordValidationResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import java.time.Instant;

@RestControllerAdvice
public class ControllerAdvice extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            final MethodArgumentNotValidException ex,
            final HttpHeaders headers,
            final HttpStatus status,
            final WebRequest request) {
        return handleResponse(ex,
                request,
                false,
                PasswordValidationResponse.of(PasswordResponseCode.DADOS_INCONSISTENTES));
    }

    private ResponseEntity<Object> handleResponse(final Exception ex,
                                                  final WebRequest request,
                                                  final Boolean technicalError,
                                                  final PasswordValidationResponse response) {
        final var result = response.getResult();
        return super.handleExceptionInternal(
                ex,
                response,
                new HttpHeaders(),
                HttpStatus.OK,
                request);
    }
}