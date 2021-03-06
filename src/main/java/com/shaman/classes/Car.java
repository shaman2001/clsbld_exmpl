package com.shaman.classes;

import com.shaman.classes.Vehicle.*;

/**
 * Created by shaman on 01.02.17.
 */
public class Car extends Vehicle {
    private ColorNames color;
    private CarTypes carType;

    //constructors----------------------------------------------------
    public Car () {
        super ();
        this.color = null;
        this.carType = null;
    }

    public Car(CarBuilder car_builder) {
        super(car_builder);
        this.color = car_builder.color;
        this.carType = car_builder.carType;
    }
    //getters------------------------------------------------------------------------------
    public ColorNames getColor() {
        return color;
    }

    public CarTypes getCarType() {
        return carType;
    }

    public enum CarTypes {
        SEDAN, COUPE, HATCHBACK, MINIVAN, CABRIO, COMPACT, SPORT
    }
    //inner builder class--------------------------------------------------------
    public static class CarBuilder extends Vehicle.Builder{
        private ColorNames color;
        private CarTypes carType;

        public CarBuilder(String p_mark, String  p_model, String p_owner) {
            super(p_mark, p_model, p_owner);
        }

        public CarBuilder setColor(ColorNames val) {
            this.color = val;
            return this;
        }

        public CarBuilder setCarType(CarTypes val) {
            this.carType = val;
            return this;
        }
        @Override
        public Car build() {
            return new Car(this);
        }
    }
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append(", цвет - ");
        builder.append(this.getColor());
        builder.append(", тип - ");
        builder.append(this.getCarType());
        return builder.toString();
    }
}
