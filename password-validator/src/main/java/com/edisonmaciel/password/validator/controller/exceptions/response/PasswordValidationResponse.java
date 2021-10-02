package com.edisonmaciel.password.validator.controller.exceptions.response;

import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
public class PasswordValidationResponse {

    private PasswordResponseCode result;

    private String dateHour;

    public PasswordValidationResponse(final PasswordResponseCode resultado) {
        this.result = resultado;
        this.dateHour = createDate();
    }

    public static PasswordValidationResponse of(final PasswordResponseCode result) {
        return new PasswordValidationResponse(result);
    }

    private String createDate() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMddHHmmss"));
    }

}
