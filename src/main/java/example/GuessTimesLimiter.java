package example;

public class GuessTimesLimiter {

    private int times;

    public GuessTimesLimiter() {
        this.times = 0;
    }

    public boolean isTimesExceeded() {
        return false;
    }
}
