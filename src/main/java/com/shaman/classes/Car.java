package com.shaman.classes;

import com.shaman.classes.Vehicle.*;

/**
 * Created by shaman on 01.02.17.
 */
public class Car extends Vehicle {
    private ColorNames color;
    private CarTypes type;

    //constructors
    public Car () {
        super ();
        this.color = null;
        this.type = null;
    }

    public Car(CarBuilder car_builder) {
        super(car_builder);
        this.color = car_builder.color;
        this.type = car_builder.type;
    }
    //getters
    public ColorNames getColor() {
        return color;
    }

    public CarTypes getType() {
        return type;
    }

    public enum CarTypes {
        SEDAN, COUPE, HATCHBACK, MINIVAN, CABRIO, COMPACT, SPORT
    }
    //inner builder class
    public static class CarBuilder extends Vehicle.Builder{
        private ColorNames color;
        private CarTypes type;

        public CarBuilder(String p_mark, String  p_model, String p_owner) {
            super(p_mark, p_model, p_owner);
        }

        public CarBuilder setColor(ColorNames val) {
            this.color = val;
            return this;
        }

        public CarBuilder setType(CarTypes val) {
            this.type = val;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append(", цвет -");
        builder.append(this.getColor());
        builder.append(", тип -");
        builder.append(this.getType());
        return builder.toString();
    }
}
