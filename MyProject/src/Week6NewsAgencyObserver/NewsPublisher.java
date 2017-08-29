package Week6NewsAgencyObserver;

import java.util.Observer;

public interface NewsPublisher { //observer logic Subject Class
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
