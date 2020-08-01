package example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputConverterTest {

    private InputConverter inputConverter;

    @BeforeEach
    public void setUp() {
        inputConverter = new InputConverter();
    }

    @Test
    void should_return_int_array_1234_when_convert_given_string_1234() {
        // given
        String input = "1 2 3 4";
        // when
        int[] actual = inputConverter.convert(input);
        // then
        assertEquals(new int[] {1, 2, 3, 4}, actual);
    }
}
