package example;

public class GuessNumber {

    private final int[] answer;

    public GuessNumber(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generator();
    }

    public String guess(int[] guessAnswer) {
        int valueAndLocationIsCorrect = 0;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == guessAnswer[i]) {
                ++valueAndLocationIsCorrect;
            }
        }
        return String.format("%dA0B", valueAndLocationIsCorrect);
    }
}
