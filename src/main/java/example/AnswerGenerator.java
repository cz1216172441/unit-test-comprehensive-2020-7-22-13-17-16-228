package example;

import java.util.Random;

public class AnswerGenerator {

    public int[] generator() {
        int[] answer = new int[4];
        Random random = new Random();
        for (int i = 0; i < answer.length; i++) {
            answer[i] = random.nextInt(10);
        }
        return answer;
    }

}
