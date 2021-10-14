package com.edisonmaciel.password.validator.validation;

import com.edisonmaciel.password.validator.controller.exceptions.FieldMessage;
import com.edisonmaciel.password.validator.domain.Password;
import com.edisonmaciel.password.validator.dto.PasswordDTO;
import com.edisonmaciel.password.validator.validation.utils.PasswordValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PasswordCheckValidation implements ConstraintValidator<ValidPassword, PasswordDTO> {

    @Override
    public void initialize(ValidPassword ann) {
    }

    @Override
    public boolean isValid(final PasswordDTO password, final ConstraintValidatorContext context) {
        List<FieldMessage> list = new ArrayList<>();

        if(!PasswordValidation.isValidPassword(password.getPassword()) || PasswordValidation.hasRepeatedCharacters(password.getPassword())){
            list.add(new FieldMessage("password", "Password does not match the standards"));
        }

        for (final FieldMessage e : list) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFieldName())
                    .addConstraintViolation();
        }
        return list.isEmpty();
    }
}
