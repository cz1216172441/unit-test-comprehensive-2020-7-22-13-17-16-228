package example;

import java.util.Arrays;

public class InputValidator {

    public boolean inputParamValidate(int[] guessAnswer) {
        if (guessAnswer != null && guessAnswer.length == 4) {
            long count = Arrays.stream(guessAnswer)
                    .filter(val -> val >= 0 && val <= 9)
                    .distinct()
                    .count();
            return count == 4;
        }
        return false;
    }

}
