package com.shaman.classes;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by shaman on 28.01.17.
 */
//enum VehicleTypes {ABSTR, CAR, SUV, TRUCK, BUS}


public  class Vehicle {
    private  String mark;
    private  String model;
    private String owner; //Name Surname
    private  Float weight;
    private  int y_of_issue;
    private  String number;
    private  String vin;
//    private final VehicleTypes vtype;
//constructors ----------------------------------------------------------------
    public Vehicle() {
        this.mark = null;
        this.model = null;
        this.owner = null;
        this.weight = 0.0f;
        this.y_of_issue = 0;
        this.number = null;
        this.vin = null;
    }

    public Vehicle(String p_mark, String p_model, String owner, float p_weight,
                   int p_yofissue, String p_number,String p_vin) {
        this.mark = p_mark;
        this.model = p_model;
        this.owner = owner;
        this.weight = p_weight;
        this.y_of_issue = p_yofissue;
        this.number = p_number;
        this.vin = p_vin;
    }

    public Vehicle(Builder builder) {
        this.mark = builder.mark;
        this.model = builder.model;
        this.owner = builder.owner;
        this.weight = builder.weight;
        this.y_of_issue = builder.y_of_issue;
        this.number = builder.number;
        this.vin = builder.vin;
    }

    public enum ColorNames {
        RED, GREEN, BLUE, BLACK, WHITE,
        MAGENTA, BROWN, PURPLE, YELLOW, SILVER, ORANGE
    }

//getters and setters-----------------------------------------------------------
    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public int getY_of_issue() {
        return y_of_issue;
    }

    public void setY_of_issue(int y_of_issue) throws Exception {
        Calendar cal = new GregorianCalendar();
        if (y_of_issue<1890 && y_of_issue>cal.get(cal.YEAR)) {
            this.y_of_issue = y_of_issue;
        } else {
            throw new Exception("Invalid year of issue");
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public static class Builder {
        //required paremeters
        private String mark;
        private String model;
        private String owner;
        //optional parameters
        private Float weight = 0.0f;
        private int y_of_issue = 0;
        private String number = "";
        private String vin = "";

        public  Builder () {
        }

        public Builder (String p_mark, String  p_model, String p_owner) {
            this.mark = p_mark;
            this.model = p_model;
            this.owner = p_owner;
        }
        public Builder setWeight (Float val) {
            this.weight = val;
            return this;
        }
        public Builder set_Y_of_issue(int val) {
            this.y_of_issue = val;
            return this;
        }
        public Builder setNumber(String val) {
            this.number = val;
            return this;
        }
        public Builder setVin(String val) {
            this.vin = val;
            return this;
        }
        public Vehicle build() {
            return new Vehicle(this);
        }

    }
    public String toString() {
        StringBuilder builder = new StringBuilder("Автомобиль ");
        builder.append(this.getMark());
        builder.append(" ");
        builder.append(this.getModel());
        builder.append("; владелец: ");
        builder.append(this.getOwner());
        builder.append("; вес - ");
        builder.append(this.getWeight());
        builder.append("тн.; год выпуска ");
        builder.append(this.getY_of_issue());
        builder.append("; госномер - ");
        builder.append(this.getNumber());
        builder.append("; VIN - ");
        builder.append(this.getVin());
        return builder.toString();
    }

}