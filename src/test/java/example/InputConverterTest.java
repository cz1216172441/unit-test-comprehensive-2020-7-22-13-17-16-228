package example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        assertArrayEquals(new int[]{1, 2, 3, 4}, actual);
    }

    @Test
    void should_throw_number_format_exception_when_convert_given_a123() {
        // given
        String input = "a 1 2 3";
        // when
        // then
        assertThrows(NumberFormatException.class, () -> inputConverter.convert(input));
    }

    @Test
    void should_throw_number_format_exception_when_convert_given_empty_string() {
        // given
        String input = "";
        // when
        // then
        assertThrows(NumberFormatException.class, () -> inputConverter.convert(input));
    }

    @Test
    void should_throw_null_pointer_exception_when_convert_given_null() {
        // given
        // when
        // then
        assertThrows(NullPointerException.class, () -> inputConverter.convert(null));
    }
}
