package integration;

import com.edisonmaciel.password.validator.controller.PasswordController;
import com.edisonmaciel.password.validator.controller.exceptions.response.PasswordResponseCode;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = PasswordController.class)
@AutoConfigureMockMvc
@EnableWebMvc
class PasswordControllerTest {

    private static final String PASSWORD_VALIDATION_ENDPOINT = "/password";

    @Autowired
    private MockMvc mockMvc;


    @Test
    @SuppressWarnings("ConstantConditions")
    void shouldReturnOkWhenCallingPasswordValidationEndpointWithPasswordPayload() throws Exception {
        final var createTransactionRequestSpec = getClass()
                .getClassLoader()
                .getResourceAsStream("password-payload.json")
                .readAllBytes();

        mockMvc.perform(post(PASSWORD_VALIDATION_ENDPOINT)
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(createTransactionRequestSpec))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result", is(PasswordResponseCode.SUCCESS.getCode())));
    }

}

