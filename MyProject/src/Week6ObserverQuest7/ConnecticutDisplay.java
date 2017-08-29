package Week6ObserverQuest7;

import java.util.Observable;
import java.util.Observer;

public class ConnecticutDisplay implements Observer, DisplayElement {

    private double first;
    private double second;
    private double third;
    private double fourth;
    private double fifth;

    public ConnecticutDisplay(Observable observable) {
        observable.addObserver(this);
    }


    public void update(Observable observable, Object arg) {
        if (observable instanceof PowerballData) {
            PowerballData powerballData = (PowerballData)observable;
            this.first = powerballData.getFirst();
            this.second = powerballData.getSecond();
            this.third = powerballData.getThird();
            this.fourth = powerballData.getFourth();
            this.fifth = powerballData.getFifth();
        }
        display();
    }

    public void display() {
        System.out.println("Connecticut Lotto Drawings: " + first + " " + second + " " + third + " " + fourth + " " + fifth);
    }
}
