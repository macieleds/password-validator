package com.edisonmaciel.password.validator.domain;

import com.edisonmaciel.password.validator.validation.ValidPassword;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ValidPassword
public class Password {

    @NotNull
    private String password;

}
