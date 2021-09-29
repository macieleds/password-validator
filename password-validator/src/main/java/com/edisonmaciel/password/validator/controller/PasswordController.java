package com.edisonmaciel.password.validator.controller;

import com.edisonmaciel.password.validator.domain.Password;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/password")
public class PasswordController {


    @PostMapping
    public String insertPassword(@Valid Password password){
        return "OK";
    }

//    @PostMapping
//    public ResponseEntity<Password> insertPassword(@Valid @RequestBody Password password){
//        final var pw = new Password();
//        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{password}")
//                .buildAndExpand(pw.getPassword()).toUri();
//        return ResponseEntity.created(uri).body(pw);
//    }


}
