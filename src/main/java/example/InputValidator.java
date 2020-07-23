package example;

public class InputValidator {
    public boolean inputParamValidate(int[] guessAnswer) {
        boolean isParamValid = false;
        if (guessAnswer != null) {
            isParamValid = guessAnswer.length == 4;
            if (!isParamValid) {
                return false;
            }
            for (int value: guessAnswer) {
                if (value < 0) {
                    isParamValid = false;
                    break;
                }
            }
        }
        return isParamValid;
    }
}
