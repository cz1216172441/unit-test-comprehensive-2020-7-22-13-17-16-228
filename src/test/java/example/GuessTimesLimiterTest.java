package example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GuessTimesLimiterTest {

    @Test
    void should_return_true_when_is_times_exceeded_given_times_7() {
        // given
        GuessTimesLimiter guessTimesLimiter = new GuessTimesLimiter(7);
        // when
        boolean isTimesExceeded = guessTimesLimiter.isTimesExceeded();
        // then
        Assertions.assertTrue(isTimesExceeded);
    }
}