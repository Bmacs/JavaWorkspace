package Week6ObserverQuest7;

import java.util.Observable;
import java.util.Observer;
import Week6ObserverQuest7.RhodeIslandDisplay;
import Week6ObserverQuest7.PowerballData;

public class PowerballDrawStation {


    public static void main(String[] args) {
        PowerballData powerballData = new PowerballData();
        PowerballData powerballData1 = new PowerballData();

        ConnecticutDisplay connecticutDisplay = new ConnecticutDisplay(powerballData);
        RhodeIslandDisplay rhodeIslandDisplay = new RhodeIslandDisplay(powerballData1);

        powerballData.setMeasurements(5, 23, 12, 13, 9);
        powerballData1.setMeasurements(6, 31, 20, 10, 4);


    }
}
