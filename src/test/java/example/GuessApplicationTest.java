package example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class GuessApplicationTest {

    @InjectMocks
    private GuessApplication guessApplication;

    @Mock
    private GuessNumber guessNumber;

    @Mock
    private InputValidator inputValidator;

    private ByteArrayOutputStream outContent;

    @BeforeEach
    public void setUp() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void should_output_game_won_when_play_given_4A0B() {
        // given
        String input = "1 2 3 4";
        // when
        try (MockedStatic<InputUnit> mocked = mockStatic(InputUnit.class)) {
            mocked.when(InputUnit::getInput).thenReturn(input);
            when(inputValidator.inputParamValidate(any())).thenReturn(true);
            when(guessNumber.guess(any())).thenReturn("4A0B");
            guessApplication.play();
            // then
            String[] output = outContent.toString().split("\n");
            assertAll(
                    () -> assertEquals("Guess Game Start...", output[0]),
                    () -> assertEquals("please enter 4 numbers (0-9, no repeated, separated by spaces): ", output[1]),
                    () -> assertEquals("Game Won!!!", output[2])
            );
        }
    }

    @Test
    void should_output_game_won_when_play_given_times_5_and_final_result_is_4A0B() {
        // given
        String input1 = "1 2 3 0";
        String input2 = "1 2 3 4";
        String result1 = "3A0B";
        String result2 = "4A0B";
        // when
        try (MockedStatic<InputUnit> mocked = mockStatic(InputUnit.class)) {
            mocked.when(InputUnit::getInput)
                    .thenReturn(input1)
                    .thenReturn(input1)
                    .thenReturn(input1)
                    .thenReturn(input1)
                    .thenReturn(input1)
                    .thenReturn(input2);
            when(inputValidator.inputParamValidate(any())).thenReturn(true)
                .thenReturn(true)
                .thenReturn(true)
                .thenReturn(true)
                .thenReturn(true)
                .thenReturn(true);
            when(guessNumber.guess(any())).thenReturn(result1)
                .thenReturn(result1)
                .thenReturn(result1)
                .thenReturn(result1)
                .thenReturn(result1)
                .thenReturn(result2);
            guessApplication.play();
            // then
            String[] output = outContent.toString().split("\n");
            assertAll(
                    () -> assertEquals("Guess Game Start...", output[0]),
                    () -> assertEquals("please enter 4 numbers (0-9, no repeated, separated by spaces): ", output[1]),
                    () -> assertEquals(result1, output[2]),
                    () -> assertEquals(result1, output[3]),
                    () -> assertEquals(result1, output[4]),
                    () -> assertEquals(result1, output[5]),
                    () -> assertEquals(result1, output[6]),
                    () -> assertEquals("Game Won!!!", output[7])
            );
        }
    }

}