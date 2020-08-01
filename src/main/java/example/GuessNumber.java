package example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GuessNumber {

    private final int[] answer;

    public GuessNumber(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
    }

    public String guess(int[] guessAnswer) {
        List<Integer> actualNums = Arrays.stream(answer).boxed().collect(Collectors.toList());
        List<Integer> guessNums = Arrays.stream(guessAnswer).boxed().collect(Collectors.toList());

        int aCount = guessNumAndIndexCorrect(actualNums, guessNums);
        int bCount = guessNumCorrectButIndexIncorrect(actualNums, guessNums, aCount);

        return String.format("%dA%dB", aCount, bCount);
    }

    private int guessNumAndIndexCorrect(List<Integer> actualNums, List<Integer> guessNums) {
        return (int) actualNums.stream()
                .filter(num -> num.equals(guessNums.get(actualNums.indexOf(num))))
                .count();
    }

    private int guessNumCorrectButIndexIncorrect(List<Integer> actualNums, List<Integer> guessNums, int aCount) {
        return (int) actualNums.stream()
                .filter(guessNums::contains)
                .count() - aCount;
    }
}
