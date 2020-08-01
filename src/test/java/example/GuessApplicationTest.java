package example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mockStatic;

public class GuessApplicationTest {

    private GuessApplication guessApplication;

    private PrintStream outStream;

    private ByteArrayOutputStream outContent;

    @BeforeEach
    public void setUp() {
        guessApplication = new GuessApplication();
        outContent = new ByteArrayOutputStream();
        outStream = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(outStream);
    }

    @Test
    void should_tips_input_error_when_play_given_wrong_input() {
        // given
        String input = "";
        // when
        try (
            MockedStatic<InputUnit> mocked = mockStatic(InputUnit.class)
        ) {
            mocked.when(InputUnit::getInput).thenReturn(input);
            guessApplication.play();
            // then
            String[] output = outContent.toString().split("\n");
            assertAll(
                    () -> assertEquals("Guess Game Start...", output[0]),
                    () -> assertEquals("please enter 4 numbers (0-9, no repeated, separated by spaces): ", output[1]),
                    () -> assertEquals("Wrong Input，Input again: ", output[2])
            );
        }
    }

    @Test
    void should_output_game_won_when_play_given_4A0B() {
        // given
        String input = "1 2 3 4";
        // when
        try (
                MockedStatic<InputUnit> mocked = mockStatic(InputUnit.class)
        ) {
            mocked.when(InputUnit::getInput).thenReturn(input);
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
}