package example;

import java.util.Arrays;

public class InputValidator {

    public boolean inputParamValidate(int[] guessAnswer) {
        if (guessAnswer != null && guessAnswer.length == AnswerGenerator.ANSWER_LIMITED_SIZE) {
            long count = Arrays.stream(guessAnswer)
                    .filter(val -> val >= AnswerGenerator.ANSWER_LOWER_BOUND && val <= AnswerGenerator.ANSWER_UPPER_BOUND)
                    .distinct()
                    .count();
            return count == AnswerGenerator.ANSWER_LIMITED_SIZE;
        }
        return false;
    }

}
