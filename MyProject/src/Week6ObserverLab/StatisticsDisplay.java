package Week6ObserverLab;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private float minTemp;
    private float maxTemp;
    private float avgTemp;
    private Subject weatherData;

    public StatisticsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            if (temperature < minTemp) minTemp = temperature;
            if (temperature > maxTemp) maxTemp = temperature;
            avgTemp = (avgTemp + temperature) / 2;
            display();
        }
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + avgTemp + "/" + maxTemp + "/" + minTemp);
    }
}
