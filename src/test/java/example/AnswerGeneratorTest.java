package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

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
}
