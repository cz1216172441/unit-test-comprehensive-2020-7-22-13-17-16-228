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
    void should_return_int_array_and_length_is_4_when_generate() {
        // given
        // when
        int[] answer = answerGenerator.generate();
        // then
        Assertions.assertEquals(4, answer.length);
    }

    @Test
    void should_return_array_and_not_repeated_value_when_generate() {
        // given
        // when
        int[] answer = answerGenerator.generate();
        // then
        long count = Arrays.stream(answer).distinct().count();
        Assertions.assertEquals(4, count);
    }

    @Test
    void should_return_array_and_each_value_is_between_0_and_9_when_generate() {
        // given
        // when
        int[] answer = answerGenerator.generate();
        // then
        boolean isAnswerValid = Arrays.stream(answer).allMatch(item -> item >= 0 && item <= 9);
        Assertions.assertTrue(isAnswerValid);
    }
}
