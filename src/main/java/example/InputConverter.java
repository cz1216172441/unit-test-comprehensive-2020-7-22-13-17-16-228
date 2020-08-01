package example;

import java.util.Arrays;

public class InputConverter {

    private final static String DELIMITER = " ";

    public static int[] convert(String input) {
        return Arrays.stream(input.trim().split(DELIMITER))
                .map(Integer::valueOf)
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
