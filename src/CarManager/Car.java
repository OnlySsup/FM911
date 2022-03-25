package CarManager;

import java.awt.*;
import java.util.Objects;

public abstract class Car implements Serviceble {
    String name;
    int yearOfProduction;
    int price;
    int weinght;
    Color color;
    private int distance = 0;
    protected int distancionOnService = 0;


    public Car(String name, int yearOfProduction, int price, int weinght, Color color) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
        this.weinght = weinght;
        this.color = color;
    }
    public void addDistance(int additidistance){
        distance += additidistance;
        distancionOnService += additidistance;
    }
    public void addDistance(double additidistance){
        distance += additidistance;
        distancionOnService += additidistance;
    }



    public int getDistancionOnService() {
        return distancionOnService;
    }

    public void setDistancionOnService(int distancionOnService) {
        this.distancionOnService = distancionOnService;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +

                ", distance=" + distance +

                ", distanceOnServis=" + distancionOnService +

                ", price=" + price +
                ", weinght=" + weinght +
                ", color='" + color + '\'' +
                '}';
    }

}