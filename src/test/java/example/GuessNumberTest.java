package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

public class GuessNumberTest {

    @Mock
    private AnswerGenerator answerGenerator;

    @Mock
    private GuessNumber guessNumber;

    @BeforeEach
    public void beforeAll() {
        answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generator()).thenReturn(new int[]{1, 2, 3, 4});
        guessNumber = new GuessNumber(answerGenerator);
    }

    @Test
    void should_return_4A0B_when_guess_number_given_answer_1234_and_guess_answer_1234() {
        // given
        int[] guessAnswer = {1, 2, 3, 4};
        // when
        String actual = guessNumber.guess(guessAnswer);
        // then
        Assertions.assertEquals("4A0B", actual);
    }

    @Test
    void should_return_0A0B_when_guess_number_given_answer_1234_and_guess_answer_5678() {
        // given
        int[] guessAnswer = {5, 6, 7, 8};
        // when
        String actual = guessNumber.guess(guessAnswer);
        // then
        Assertions.assertEquals("0A0B", actual);
    }

    @Test
    void should_return_2A0B_when_guess_number_given_answer_1234_and_guess_answer_1256() {
        // given
        int[] guessAnswer = {1, 2, 5, 6};
        // when
        String actual = guessNumber.guess(guessAnswer);
        // then
        Assertions.assertEquals("2A0B", actual);
    }

    @Test
    void should_return_0A2B_when_guess_number_given_answer_1234_and_guess_answer_2356() {
        // given
        int[] guessAnswer = {2, 3, 5, 6};
        // when
        String actual = guessNumber.guess(guessAnswer);
        // then
        Assertions.assertEquals("0A2B", actual);
    }

    @Test
    void should_return_2A2B_when_guess_number_given_answer_1234_and_guess_answer_4231() {
        // given
        int[] guessAnswer = {4, 2, 3, 1};
        // when
        String actual = guessNumber.guess(guessAnswer);
        // then
        Assertions.assertEquals("2A2B", actual);
    }

    @Test
    void should_return_1A1B_when_guess_number_given_answer_1234_and_guess_answer_1356() {
        // given
        int[] guessAnswer = {1, 3, 5 , 6};
        // when
        String actual = guessNumber.guess(guessAnswer);
        // then
        Assertions.assertEquals("1A1B", actual);
    }
}
