package com.edisonmaciel.password.validator.domain;

import com.edisonmaciel.password.validator.validation.ValidPassword;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Password {

    @NotNull
    private String password;

}
