package CarManager;

import java.awt.*;
import java.sql.SQLOutput;

public class CM {
    public static void main(String[] args) {
        PassengerCar prius = new PassengerCar ("prius", 2000, 1200, 2111, Color.BLACK);

        PassengerCar bmv = new PassengerCar ("BMV X 5", 1232, 4200, 1333, Color.WHITE);

        Bus lada = new Bus ("BMV X 5", 1232, 300, 1222, Color.WHITE);

        bmv.addDistance(1000);
        bmv.addDistance(1500000);
        lada.addDistance(15000);

        System.out.println(prius);
        System.out.println(bmv);


        System.out.println(bmv.isReadyToService());
        System.out.println(lada.isReadyToService());
        System.out.println(bmv.isReadyToService());
    }

}
