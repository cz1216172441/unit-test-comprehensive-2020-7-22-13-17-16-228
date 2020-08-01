package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InputConverterTest {

    @Test
    void should_return_int_array_1234_when_convert_given_string_1234() {
        // given
        String input = "1 2 3 4";
        // when
        int[] actual = InputConverter.convert(input);
        // then
        assertArrayEquals(new int[]{1, 2, 3, 4}, actual);
    }

    @Test
    void should_throw_number_format_exception_when_convert_given_a123() {
        // given
        String input = "a 1 2 3";
        // when
        // then
        assertThrows(NumberFormatException.class, () -> InputConverter.convert(input));
    }
}
