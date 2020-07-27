package example;

public class GuessNumber {

    private final int[] answer;

    public GuessNumber(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
    }

    public String guess(int[] guessAnswer) {
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
