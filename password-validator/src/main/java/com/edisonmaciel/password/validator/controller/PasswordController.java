package com.edisonmaciel.password.validator.controller;

import com.edisonmaciel.password.validator.domain.Password;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/password")
public class PasswordController {


    @PostMapping
    public String insertPassword(@Valid @RequestBody final Password password){
        return "VALID PASSWORD";
    }

}
