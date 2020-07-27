package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnswerGenerator {

    public int[] generate() {
        List<Integer> allNums = new ArrayList<>();
        int answerSize = 4;
        int lowerBound = 0;
        int upperBound = 9;
        for (int i = lowerBound; i <= upperBound; i++) {
            allNums.add(i);
        }
        Collections.shuffle(allNums);
        return allNums.stream()
                .limit(answerSize)
                .mapToInt(Integer::valueOf)
                .toArray();
    }

}
