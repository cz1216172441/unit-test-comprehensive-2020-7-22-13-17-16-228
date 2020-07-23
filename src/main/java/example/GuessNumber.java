package example;

public class GuessNumber {

    private final int[] answer;

    public GuessNumber(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generator();
    }

    public String guess(int[] guessAnswer) {
        boolean flag = true;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] != guessAnswer[i]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            return "4A0B";
        }
        return null;
    }
}
