package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

public class GuessNumberTest {

    @Test
    void should_return_4A0B_when_guess_number_given_answer_1234_and_guess_answer_1234() {
        // given
        int[] guessAnswer = {1, 2, 3, 4};
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generator()).thenReturn(new int[]{1, 2, 3, 4});
        GuessNumber guessNumber = new GuessNumber(answerGenerator);
        // when
        String actual = guessNumber.guess(guessAnswer);
        // then
        Assertions.assertEquals("4A0B", actual);
    }

    @Test
    void should_return_0A0B_when_guess_number_given_answer_1234_and_guess_answer_5678() {
        // given
        int[] guessAnswer = {5, 6, 7, 8};
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generator()).thenReturn(new int[]{1, 2, 3, 4});
        GuessNumber guessNumber = new GuessNumber(answerGenerator);
        // when
        String actual = guessNumber.guess(guessAnswer);
        // then
        Assertions.assertEquals("0A0B", actual);
    }
}
