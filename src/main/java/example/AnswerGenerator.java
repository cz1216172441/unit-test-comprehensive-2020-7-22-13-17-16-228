package example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnswerGenerator {

    public int[] generator() {
        int length = 4;
        int[] answer = new int[length];
        List<Integer> list = new ArrayList<>(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            Integer value = random.nextInt(10);
            if (!list.contains(value)) {
                list.add(value);
                answer[i] = value;
            }
        }
        return answer;
    }

}
