package CarManager;

import java.awt.*;

public class PassengerCar extends Car {
    public PassengerCar (String name, int yearOfProduction, int price, int weinght, Color color) {
        super(name, yearOfProduction, price, weinght, color);

    }
    @Override
        public boolean isReadyToService(){
            if(distancionOnService > 10000){
                return true;
            }else{
                return false;
            }
        }
    }


