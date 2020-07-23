package example;

public class InputValidator {
    public boolean inputParamValidate(int[] guessAnswer) {
        return guessAnswer != null && guessAnswer.length == 4;
    }
}
