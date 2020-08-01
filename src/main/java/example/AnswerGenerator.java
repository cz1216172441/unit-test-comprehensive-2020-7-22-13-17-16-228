package example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AnswerGenerator {

    public int[] generate() {
        List<Integer> source = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        Collections.shuffle(source);
        return source.stream()
                .limit(4)
                .mapToInt(Integer::valueOf)
                .toArray();
    }



}
