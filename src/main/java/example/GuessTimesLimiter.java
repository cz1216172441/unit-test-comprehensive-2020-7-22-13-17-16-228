package example;

public class GuessTimesLimiter {

    private int times;

    public void setTimes(int times) {
        this.times = times;
    }

    public int getTimes() {
        return times;
    }

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
