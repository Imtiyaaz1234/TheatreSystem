package com.TPFinalGroupAssign.TheatreSystem.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Seating {
    @GeneratedValue
    @Id
    private long seating_id;
    private int bookings;
    private int avail;

    public long getSeating_id() {
        return seating_id;
    }

    public int getBookings() {
        return bookings;
    }

    public int getAvail() {
        return avail;
    }

    public ArrayList<Integer> getSeatNumber() {
        return seatNumber;
    }

    public String getLine() {
        return line;
    }

    public double getPrice() {
        return price;
    }

    private ArrayList<Integer> seatNumber;
    private String line;
    private int price;

    public Seating(){

    }

    public Seating(Builder builder){
        this.seating_id = builder.seating_id;
        this.seatNumber = builder.seatNumber;
        this.line = builder.ln;
        this.price = builder.price;
        this.bookings = builder.bookings;
        this.avail = builder.avail;
    }

    public static class Builder{
        private long seating_id;
        private ArrayList<Integer> seatNumber;
        private String ln;
        private int price;
        private int bookings;
        private int avail;

        public Builder seating_id(long seating_idid){
            this.seating_id = seating_id;
            return this;
        }

        public Builder seatNumber(ArrayList<Integer> seatNumber){
            this.seatNumber = seatNumber;
            return this;
        }

        public Builder line(String l){
            this.ln = l;
            return this;
        }

        public Builder price(int price){
            this.price = price;
            return this;
        }

        public Builder bookings(int bookings)
        {
            this.bookings = bookings;
            return this;
        }

        public Builder avail(int avail)
        {
            this.avail = avail;
            return this;
        }

        public Seating build(){ return new Seating(this);}
    }
}