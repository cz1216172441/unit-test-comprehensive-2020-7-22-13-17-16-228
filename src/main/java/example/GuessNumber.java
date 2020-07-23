package example;

public class GuessNumber {

    private final int[] answer;

    public GuessNumber() {
        answer = new AnswerGenerator().generator();
    }

    public String guess(int[] guessAnswer) {
        return null;
    }
}
