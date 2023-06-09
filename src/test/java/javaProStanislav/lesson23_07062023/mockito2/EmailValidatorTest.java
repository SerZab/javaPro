package javaProStanislav.lesson23_07062023.mockito2;

import javaProStanislav.lesson23_07062023.EmailValidationException;
import javaProStanislav.lesson23_07062023.EmailValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EmailValidatorTest {
    @Test
    public void testValidEmail() {
        String validEmail = "test@example.com";
        Assertions.assertDoesNotThrow(() -> EmailValidator.validateEmail(validEmail));
    }

    @ParameterizedTest
    @ValueSource(strings = {"invalid_email", "invalid@com", "invalid.email@example"})
    public void testInvalidEmail(String email) {
        Assertions.assertThrows(EmailValidationException.class, () -> EmailValidator.validateEmail(email));
    }
}
