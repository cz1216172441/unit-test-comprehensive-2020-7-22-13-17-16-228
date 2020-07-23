package example;

public class GuessTimesLimiter {

    private int times;

    public GuessTimesLimiter() {
        this.times = 0;
    }

    public GuessTimesLimiter(int times) {
        this.times = times;
    }

    public boolean isTimesExceeded() {
        return false;
    }
}
