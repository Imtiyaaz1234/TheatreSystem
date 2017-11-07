package com.TPFinalGroupAssign.TheatreSystem.Domain;


public class Economy extends Seating {
    private Long seat_id;
    private String class_name;
    private int price;

    private Economy() {

    }

    public Long getSeat_id() {
        return seat_id;
    }

    public String getClass_name() {
        return class_name;
    }

    public int getprice() {
        return price;
    }

    public Economy(Builder builder){
        this.seat_id = builder.seat_id;
        this.class_name = builder.class_name;
        this.price = builder.price;
    }


    public static class Builder{
        private Long seat_id;
        private String class_name;
        private int price;

        public Builder seat_id(Long seat_id)
        {
            this.seat_id = seat_id;
            return this;
        }

        public Builder class_name(String class_name)
        {
            this.class_name = class_name;
            return this;
        }

        public Builder price(int price)
        {
            this.price = price;
            return this;
        }

        public Economy build(){
            return new Economy(this);
        }
    }
}