package com.shaman;

import com.shaman.classes.Car;
import com.shaman.classes.Vehicle;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Vehicle myCar = new Car.CarBuilder("Peugeot", "407", "Kotovich Vladimir")
                .setColor(Vehicle.ColorNames.SILVER).setType(Car.CarTypes.SEDAN).setNumber("2037-KA7")
                .set_Y_of_issue(1999).setWeight(1.540f).setVin("XXXXXXXXXXXXXXXXXXXX").build();
        System.out.println(myCar.toString());
    }
}
