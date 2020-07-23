package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class InputValidatorTest {

    @Mock
    private InputValidator inputValidator;

    @BeforeEach
    public void before() {
        inputValidator = new InputValidator();
    }

    @Test
    void should_return_false_when_input_param_validate_given_null() {
        // given
        // when
        boolean isParamValid = inputValidator.inputParamValidate(null);
        // then
        Assertions.assertFalse(isParamValid);
    }

    @Test
    void should_return_false_when_input_param_validate_given_123() {
        // given
        int[] guessAnswer = {1, 2, 3};
        // when
        boolean isParamValid = inputValidator.inputParamValidate(guessAnswer);
        // then
        Assertions.assertFalse(isParamValid);
    }

    @Test
    void should_return_true_when_input_param_validate_given_1234() {
        // given
        int[] guessAnswer = {1, 2, 3, 4};
        // when
        boolean isParamValid = inputValidator.inputParamValidate(guessAnswer);
        // then
        Assertions.assertTrue(isParamValid);
    }

    @Test
    void should_return_false_when_input_param_validate_given_12345() {
        // given
        int[] guessAnswer = {1, 2, 3, 4, 5};
        // when
        boolean isParamValid = inputValidator.inputParamValidate(guessAnswer);
        // then
        Assertions.assertFalse(isParamValid);
    }

    @Test
    void should_return_false_when_input_param_validate_given_one_value_less_than_0_at_least() {
        // given
        int[] guessAnswer = {-1, 2, 3, 4};
        // when
        boolean isParamValid = inputValidator.inputParamValidate(guessAnswer);
        // then
        Assertions.assertFalse(isParamValid);
    }

    @Test
    void should_return_false_when_input_param_validate_given_one_value_more_than_9_at_least() {
        // given
        int[] guessAnswer = {1, 2, 3, 9};
        // when
        boolean isParamValid = inputValidator.inputParamValidate(guessAnswer);
        // then
        Assertions.assertFalse(isParamValid);
    }
}
