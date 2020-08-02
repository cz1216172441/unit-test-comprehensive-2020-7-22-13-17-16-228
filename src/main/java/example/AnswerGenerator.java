package example;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AnswerGenerator {

    public static final int ANSWER_LOWER_BOUND = 0;
    public static final int ANSWER_UPPER_BOUND = 9;
    public static final int ANSWER_LIMITED_SIZE = 4;

    public int[] generate() {
        List<Integer> source = IntStream.range(ANSWER_LOWER_BOUND, ANSWER_UPPER_BOUND + 1)
                .boxed()
                .collect(Collectors.toList());
        Collections.shuffle(source);
        return source.stream()
                .limit(ANSWER_LIMITED_SIZE)
                .mapToInt(Integer::valueOf)
                .toArray();
    }

}
