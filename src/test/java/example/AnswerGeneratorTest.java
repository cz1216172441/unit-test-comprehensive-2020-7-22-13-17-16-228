package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.Arrays;

public class AnswerGeneratorTest {

    @Mock
    private AnswerGenerator answerGenerator;

    @BeforeEach
    public void before() {
        answerGenerator = new AnswerGenerator();
    }

    @Test
    void should_return_array_and_length_is_4_and_type_is_int_when_generate() {
        // given
        // when
        int[] answer = answerGenerator.generator();
        // then
        Assertions.assertEquals(4, answer.length);
    }

    @Test
    void should_return_array_and_not_repeated_value_when_generate() {
        // given
        // when
        int[] answer = answerGenerator.generator();
        // then
        boolean hasRepeated = false;
        Arrays.sort(answer);
        for (int i = 0; i < answer.length - 1; i++) {
            if (answer[i] == answer[i + 1]) {
                hasRepeated = true;
                break;
            }
        }
        Assertions.assertFalse(hasRepeated);
    }

    @Test
    void should_return_array_and_each_value_is_between_0_and_9_when_generate() {
        // given
        // when
        int[] answer = answerGenerator.generator();
        // then
        boolean isValid = true;
        for (int value : answer) {
            if (value < 0 || value > 9) {
                isValid = false;
                break;
            }
        }
        Assertions.assertTrue(isValid);
    }
}
