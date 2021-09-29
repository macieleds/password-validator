package com.edisonmaciel.password.validator.domain;

import com.edisonmaciel.password.validator.validation.ValidPassword;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Password {

    @ValidPassword
    @NotEmpty
    private String password;

}
