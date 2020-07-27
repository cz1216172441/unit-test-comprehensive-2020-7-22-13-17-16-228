package example;

public class GuessProcess {

    private int times;

    public void setTimes(int times) {
        this.times = times;
    }

    public int getTimes() {
        return times;
    }

    public GuessProcess() {
        this.times = 1;
    }

    public GuessProcess(int times) {
        this.times = times;
    }

    public boolean isTimesExceeded() {
        return times > 6;
    }
}
