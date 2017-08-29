package Week6ObserverQuest7;

import java.util.Observable;

public class PowerballData extends Observable {

    private double first;
    private double second;
    private double third;
    private double fourth;
    private double fifth;

    public PowerballData() {
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(double first, double second, double third, double fourth, double fifth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        measurementsChanged();
    }

    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }

    public double getThird() {
        return third;
    }

    public double getFourth() {
        return fourth;
    }

    public double getFifth() {
        return fifth;
    }
}
