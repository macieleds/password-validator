package com.edisonmaciel.password.validator.controller;

import com.edisonmaciel.password.validator.controller.exceptions.response.PasswordResponseCode;
import com.edisonmaciel.password.validator.controller.exceptions.response.PasswordValidationResponse;
import com.edisonmaciel.password.validator.domain.Password;
import com.edisonmaciel.password.validator.dto.PasswordDTO;
import com.edisonmaciel.password.validator.validation.utils.PasswordValidation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping
public class PasswordController {


    @PostMapping("/password")
    public ResponseEntity<PasswordValidationResponse> insertPassword(
            @Valid
            @RequestBody
            final PasswordDTO passwordDTO){
        return ResponseEntity.ok(PasswordValidationResponse.of(PasswordResponseCode.SUCCESS));
    }

}
