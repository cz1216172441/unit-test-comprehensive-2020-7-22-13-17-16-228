package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InputValidatorTest {

    @Test
    void should_return_false_when_input_param_validate_given_null() {
        // given
        InputValidator inputValidator = new InputValidator();
        int[] guessAnswer = null;
        // when
        boolean isParamValid = inputValidator.inputParamValidate(guessAnswer);
        // then
        Assertions.assertFalse(isParamValid);
    }

    @Test
    void should_return_false_when_input_param_validate_given_123() {
        // given
        InputValidator inputValidator = new InputValidator();
        int[] guessAnswer = {1, 2, 3};
        // when
        boolean isParamValid = inputValidator.inputParamValidate(guessAnswer);
        // then
        Assertions.assertFalse(isParamValid);
    }

    @Test
    void should_return_true_when_input_param_validate_given_1234() {
        // given
        InputValidator inputValidator = new InputValidator();
        int[] guessAnswer = {1, 2, 3, 4};
        // when
        boolean isParamValid = inputValidator.inputParamValidate(guessAnswer);
        // then
        Assertions.assertTrue(isParamValid);
    }

    @Test
    void should_return_false_when_input_param_validate_given_12345() {
        // given
        InputValidator inputValidator = new InputValidator();
        int[] guessAnswer = {1, 2, 3, 4, 5};
        // when
        boolean isParamValid = inputValidator.inputParamValidate(guessAnswer);
        // then
        Assertions.assertFalse(isParamValid);
    }

    @Test
    void should_return_false_when_input_param_validate_given_one_value_less_than_0_at_least() {
        // given
        InputValidator inputValidator = new InputValidator();
        int[] guessAnswer = {-1, 2, 3, 4};
        // when
        boolean isParamValid = inputValidator.inputParamValidate(guessAnswer);
        // then
        Assertions.assertFalse(isParamValid);
    }
}
