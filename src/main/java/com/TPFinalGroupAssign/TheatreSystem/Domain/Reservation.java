package com.TPFinalGroupAssign.TheatreSystem.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Reservation {
    @Id
    @GeneratedValue
    private Long rId;
    private ArrayList<Integer> seatNumber;
    private int total_price;
    private int show_id;
    private int userId;


    public Long getRId() {
        return rId;
    }

    public ArrayList<Integer> getSeatNumber() {
        return seatNumber;
    }

    public int getTotal_price() {
        return total_price;
    }

    public int getShow_id() {
        return show_id;
    }

    public int getuserId() {return userId;}

    public Reservation(Builder builder){
        this.rId = builder.rId;
        this.seatNumber = builder.seatNumber;
        this.total_price = builder.total_price;
        this.show_id = builder.show_id;
        this.userId = builder.userId;
    }

    public static class Builder{
        private Long rId;
        private ArrayList<Integer> seatNumber;
        private int total_price;
        private int show_id;
        private int userId;


        public Builder rId(Long rId) {
            this.rId = rId;
            return this;
        }

        public Builder seatNumber(ArrayList<Integer> seatNumber) {
            this.seatNumber = seatNumber;
            return this;
        }

        public Builder total_price(int total_price) {
            this.total_price = total_price;
            return this;
        }

        public Builder show_id(int show_id) {
            this.show_id = show_id;
            return this;
        }

        public Builder userId(int value)
        {
            this.userId = value;
            return this;
        }

        public Reservation build(){
            return  new Reservation(this);
        }
    }
}