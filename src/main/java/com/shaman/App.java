package com.shaman;

import com.shaman.classes.Vehicle;
import com.shaman.classes.Car;
import com.shaman.classes.SUV;


public class App {
    public static void main( String[] args ) {
        Vehicle myCar = new Car.CarBuilder("Citroen", "Xantia", "Kotovich Vladimir")
                .setColor(Vehicle.ColorNames.SILVER).setCarType(Car.CarTypes.SEDAN).setNumber("2037 KA-7")
                .set_Y_of_issue(1999).setWeight(1.540f).setVin("XXXXXXXXXXXXXXXXXXXX").build();
        Vehicle mySUV = new SUV.SUVBuilder("BMW", "X6", "Ivan Ivanov").setSUVType(SUV.SUVTypes.CROSSOVER)
                .setColor(Vehicle.ColorNames.BLUE).setNumber("0001 KK-1").set_Y_of_issue(2016)
                .setWeight(2.2f).setVin("YYYYYYYYYYYYYYYYYY").build();
        System.out.println(myCar.toString());
        System.out.println(mySUV.toString());
    }
}
