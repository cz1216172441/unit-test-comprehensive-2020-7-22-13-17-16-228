package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AnswerGenerator {

    public int[] generator() {
        int[] answer = new int[4];
        List<Integer> list = new ArrayList<>(4);
        Random random = new Random();
        while (list.size() < answer.length) {
            int intValue = random.nextInt(10);
            if (!list.contains(intValue)) {
                list.add(intValue);
            }
        }
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

}
