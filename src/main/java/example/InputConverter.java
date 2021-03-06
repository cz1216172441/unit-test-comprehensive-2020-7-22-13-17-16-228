package example;

import java.util.Arrays;

public class InputConverter {

    private final static String DELIMITER = " ";

    public int[] convert(String input) throws NumberFormatException {
        return Arrays.stream(input.trim().split(DELIMITER))
                .map(Integer::valueOf)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
