package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GuessTimesLimiterTest {

    @Test
    void should_return_true_when_is_times_exceeded_given_times_7() {
        // given
        GuessTimesLimiter guessTimesLimiter = new GuessTimesLimiter();
        // when
        for (int i = 0; i < 6; i++) {
            guessTimesLimiter.isTimesExceeded();
        }
        boolean isTimesExceeded = guessTimesLimiter.isTimesExceeded();
        // then
        Assertions.assertTrue(isTimesExceeded);
    }
}