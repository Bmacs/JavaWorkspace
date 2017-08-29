package Week6NewsAgencyObserver;

import java.util.Observable;
import java.util.Observer;

public class EmailSubscriber implements Observer, DisplayElement {

    public EmailSubscriber(Observable observable) {
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
