package example;

public class GuessApplication {

    private final static int GUESS_LIMITED_TIMES = 6;

    private int currentGuessTimes;
    private final GuessNumber guessNumber;
    private final InputValidator inputValidator;

    public GuessApplication(GuessNumber guessNumber, InputValidator inputValidator) {
        this.currentGuessTimes = 0;
        this.guessNumber = guessNumber;
        this.inputValidator = inputValidator;
    }

    public static void main(String[] args) {
        AnswerGenerator answerGenerator = new AnswerGenerator();
        GuessNumber guessNumber = new GuessNumber(answerGenerator);
        InputValidator inputValidator = new InputValidator();
        GuessApplication guessApplication = new GuessApplication(guessNumber, inputValidator);
        guessApplication.play();
    }

    public void play() {
        System.out.print("Guess Game Start...\n");
        System.out.print("please enter 4 numbers (0-9, no repeated, separated by spaces): \n");
        while (currentGuessTimes < GUESS_LIMITED_TIMES) {
            try {
                int[] guessAnswer = InputConverter.convert(InputUnit.getInput());
                if (inputValidator.inputParamValidate(guessAnswer)) {
                    String result = guessNumber.guess(guessAnswer);
                    if (result.equals("4A0B")) {
                        System.out.print("Game Won!!!\n");
                    } else {
                        System.out.print(result + "\n");
                    }
                    ++currentGuessTimes;
                }
            } catch (Exception e) {
                System.out.print("Wrong Input，Input again: \n");
            }
        }
    }

}
