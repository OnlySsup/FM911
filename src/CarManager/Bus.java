package CarManager;

import java.awt.*;

    public class Bus extends Car {
        public Bus (String name, int yearOfProduction, int price, int weinght, Color color) {
            super(name, yearOfProduction, price, weinght, color);
        }
        @Override
        public boolean isReadyToService(){
            if(distancionOnService > 50000){
                return true;
            }else{
                return false;
            }
        }
    }

