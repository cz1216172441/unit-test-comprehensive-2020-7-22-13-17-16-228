package example;

public class GuessTimesLimiter {

    private int times;

    public GuessTimesLimiter() {
        this.times = 1;
    }

    public GuessTimesLimiter(int times) {
        this.times = times;
    }

    public boolean isTimesExceeded() {
        return times > 6;
    }
}
