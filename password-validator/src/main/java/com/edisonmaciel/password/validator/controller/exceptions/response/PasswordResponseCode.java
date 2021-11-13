package com.edisonmaciel.password.validator.controller.exceptions.response;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Getter
@RequiredArgsConstructor
public enum PasswordResponseCode {

    SUCCESS("SUCCESS", "VALID PASSWORD"),
    INVALID_PAYLOAD("INVALID_PAYLOAD", "PASSWORD DOES NOT MATCH THE STANDARDS");

    private static final Map<String, PasswordResponseCode> MAP = Arrays.stream(PasswordResponseCode.values())
            .collect(Collectors.toMap(PasswordResponseCode::getCode, Function.identity()));

    private final String code;
    private final String description;

    @JsonValue
    public String toJson() {
        return code;
    }

}
