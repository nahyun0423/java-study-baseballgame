package baseball;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ValidationTest {

    @Test
    void validateInput_invalidLength() {
        Validation validation = new Validation(new Balls());
        String input = "1234";

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> validation.validateInput(input));
        String expectedMessage = "입력은 3자리여야 합니다.";
        String actualMessage = exception.getMessage();

        assert actualMessage.contains(expectedMessage);
    }

    @Test
    void validateInputEnd_invalidInput() {
        Validation validation = new Validation(new Balls());
        int input = 3;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> validation.validateInputEnd(input));
        String expectedMessage = "유효하지 않은 입력입니다. 1과 2만 입력해주세요.";
        String actualMessage = exception.getMessage();

        assert actualMessage.contains(expectedMessage);
    }

    @Test
    void validateInputEnd_validInput1() {
        Validation validation = new Validation(new Balls());
        int input = 1;

        assertDoesNotThrow(() -> validation.validateInputEnd(input));
    }

    @Test
    void validateInputEnd_validInput2() {
        Validation validation = new Validation(new Balls());
        int input = 2;

        assertDoesNotThrow(() -> validation.validateInputEnd(input));
    }
}