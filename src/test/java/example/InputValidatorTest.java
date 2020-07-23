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
}
