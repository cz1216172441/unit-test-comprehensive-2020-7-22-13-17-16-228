package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GuessProcessTest {

    @Test
    void should_return_true_when_is_times_exceeded_given_times_7() {
        // given
        GuessProcess guessProcess = new GuessProcess(7);
        // when
        boolean isTimesExceeded = guessProcess.isTimesExceeded();
        // then
        Assertions.assertTrue(isTimesExceeded);
    }
}