package com.edisonmaciel.password.validator.dto;

import com.edisonmaciel.password.validator.validation.ValidPassword;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ValidPassword
public class PasswordDTO {

    @NotNull
    private String password;

}
