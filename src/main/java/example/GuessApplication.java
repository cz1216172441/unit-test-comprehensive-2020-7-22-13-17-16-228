package example;

public class GuessApplication {

    public static void main(String[] args) {
        GuessApplication guessApplication = new GuessApplication();
        guessApplication.play();
    }

    public void play() {
        try {
            int[] guessAnswer = InputConverter.convert(InputUnit.getInput());
        } catch (Exception e) {
            System.out.print("Wrong Input，Input again\n");
        }
    }

}
