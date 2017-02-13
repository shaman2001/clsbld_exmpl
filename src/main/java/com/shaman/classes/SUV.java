package com.shaman.classes;

/**
 * Created by shaman on 01.02.17.
 */
public class SUV extends Vehicle {
    private ColorNames color;
    private SUVTypes suvType;

    //constructors----------------------------------------------------
    public SUV() {
        super ();
        this.color = null;
        this.suvType = null;
    }

    public SUV(SUVBuilder suv_builder) {
        super(suv_builder);
        this.color = suv_builder.color;
        this.suvType = suv_builder.suvType;
    }
    //getters------------------------------------------------------------------------------
    public ColorNames getColor() {
        return color;
    }

    public SUVTypes getSUVType() {
        return suvType;
    }

    public enum SUVTypes {
        CROSSOVER, COMPACT, FULLSIZE, PICKUP
    }
    //inner builder class--------------------------------------------------------
    public static class SUVBuilder extends Builder{
        private ColorNames color;
        private SUVTypes suvType;

        public SUVBuilder(String p_mark, String  p_model, String p_owner) {
            super(p_mark, p_model, p_owner);
        }

        public SUVBuilder setColor(ColorNames val) {
            this.color = val;
            return this;
        }

        public SUVBuilder setSUVType(SUVTypes val) {
            this.suvType = val;
            return this;
        }
        @Override
        public SUV build() {
            return new SUV(this);
        }
    }
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append(", цвет - ");
        builder.append(this.getColor());
        builder.append(", тип - ");
        builder.append(this.getSUVType());
        return builder.toString();
    }
}
