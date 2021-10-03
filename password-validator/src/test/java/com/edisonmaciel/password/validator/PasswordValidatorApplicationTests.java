package com.edisonmaciel.password.validator;

import com.edisonmaciel.password.validator.validation.utils.PasswordValidation;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class PasswordValidatorApplicationTests {

	@ParameterizedTest(name = "#{index} - Run test with password = {0}")
	@MethodSource("validPasswordProvider")
	void shouldValidateCorrectPasswordPattern(String password) {
		assertTrue(PasswordValidation.isValidPassword(password));
	}

	@ParameterizedTest(name = "#{index} - Run test with password = {0}")
	@MethodSource("invalidPasswordProvider")
	void shouldValidateIncorrectPasswordPattern(String password) {
		assertTrue(!PasswordValidation.isValidPassword(password) || PasswordValidation.hasRepeatedCharacters(password));
	}

	static Stream<String> validPasswordProvider() {
		return Stream.of(
				"AbTp9!fok"
		);
	}

	static Stream<String> invalidPasswordProvider() {
		return Stream.of(
				"",
				"aa",
				"ab",
				"AAAbbbCc",
				"AbTp9!foo",
				"AbTp9!foA",
				"AbTp9 fok"
		);
	}
}
