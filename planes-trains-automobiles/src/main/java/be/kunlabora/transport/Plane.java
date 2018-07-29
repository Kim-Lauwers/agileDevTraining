package be.kunlabora.transport;

public class Plane {
    private int hoursDelayed;

    public void delay(final int hoursDelayed) {
        this.hoursDelayed = hoursDelayed;
    }

    public int customerSatisfaction() {
        throw new RuntimeException("We never run late!");
    }

    public int getHoursDelayed() {
        return hoursDelayed;
    }
}