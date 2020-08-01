package example;

public class GuessApplication {

    public static void main(String[] args) {
        GuessApplication guessApplication = new GuessApplication();
        guessApplication.play();
    }

    public void play() {
        System.out.print("Guess Game Start...\n");
        System.out.print("please enter 4 numbers (0-9, no repeated, separated by spaces): \n");
        try {
            int[] guessAnswer = InputConverter.convert(InputUnit.getInput());
        } catch (Exception e) {
            System.out.print("Wrong Input，Input again: \n");
        }
    }

}
