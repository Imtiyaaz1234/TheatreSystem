package com.TPFinalGroupAssign.TheatreSystem.Domain;

import com.TPFinalGroupAssign.TheatreSystem.Domain.Impl.Seating_Plan;

public class VIP implements Seating_Plan {

    private String class_name;
    private int price;
    private Long seat_id;

    public VIP() {
    }

    public String getClass_name() {
        return class_name;
    }

    public int getPrice() {
        return price;
    }

    public Long getSeat_id() {
        return seat_id;
    }

    public VIP(Builder builder){
        this.class_name = builder.class_name;
        this.price = builder.price;
        this.seat_id = builder.seat_id;
    }

    public static class Builder{
        private String class_name;
        private int price;
        private Long seat_id;


        public Builder class_name(String class_name) {
            this.class_name = class_name;
            return this;
        }

        public Builder price(int price) {
            this.price = price;
            return this;
        }

        public Builder seat_id(Long seat_id) {
            this.seat_id = seat_id;
            return this;
        }


        public VIP build(){
            return new VIP(this);
        }
    }
}
