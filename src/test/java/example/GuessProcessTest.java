package example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessProcessTest {

    private GuessProcess guessProcess;

    @Mock
    private GuessNumber guessNumber;

    private PrintStream outStream;

    private ByteArrayOutputStream outContent;

    @BeforeEach
    public void setUp() {
        guessNumber = mock(GuessNumber.class);
        guessProcess = new GuessProcess(guessNumber);
        outContent = new ByteArrayOutputStream();
        outStream = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(outStream);
    }

    @Test
    void should_return_game_won_when_run_given_4A0B_and_run_1_time() {
        // given
        when(guessNumber.guess(any())).thenReturn("4A0B");
        // when
        guessProcess.run();
        // then
        assertEquals("game won!", outContent.toString());
    }
}