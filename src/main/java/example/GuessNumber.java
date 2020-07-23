package example;

public class GuessNumber {

    private final int[] answer;
    private final GuessTimesLimiter guessTimesLimiter;

    public GuessNumber(AnswerGenerator answerGenerator, GuessTimesLimiter guessTimesLimiter) {
        this.answer = answerGenerator.generator();
        this.guessTimesLimiter = guessTimesLimiter;
    }

    public String guess(int[] guessAnswer) {
        if (guessTimesLimiter.isTimesExceeded()) {
            return null;
        }
        guessTimesLimiter.setTimes(guessTimesLimiter.getTimes() + 1);
        int countValueAndLocationIsCorrect = 0;
        int countValueCorrectButLocationWrong = 0;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == guessAnswer[i]) {
                ++countValueAndLocationIsCorrect;
            }
            for (int j = 0; j < answer.length; j ++) {
                if (answer[i] != guessAnswer[i] && answer[i] == guessAnswer[j]) {
                    ++countValueCorrectButLocationWrong;
                }
            }
        }
        return String.format("%dA%dB", countValueAndLocationIsCorrect, countValueCorrectButLocationWrong);
    }
}
