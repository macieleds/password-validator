package com.edisonmaciel.password.validator.validation.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {

    private static final String PASSWORD_PATTERN =

            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()+-])(?=\\S+$).{9,}$";

    private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);

    public static boolean isValidPassword(final String password) {
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static boolean hasRepeatedCharacters(final CharSequence password) {
        for (int i = 0; i < password.length(); i++) {
            for (int j = i + 1; j < password.length(); j++) {
                if (password.charAt(i) == password.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}
