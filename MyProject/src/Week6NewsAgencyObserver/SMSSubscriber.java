package Week6NewsAgencyObserver;

import java.util.Observable;
import java.util.Observer;

public class SMSSubscriber implements Observer, DisplayElement {

    public SMSSubscriber(Observable observable) {
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
//        if() {
//
//        }
        display();
    }

    public void display() {
        System.out.println();
    }
}
