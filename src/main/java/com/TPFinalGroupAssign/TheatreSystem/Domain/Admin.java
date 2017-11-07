package com.TPFinalGroupAssign.TheatreSystem.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String surname;


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }



    public Admin(){

    }

    public Admin(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;

    }

    public static class Builder{
        private long id;
        private String name;
        private String surname;


        public Builder id(long id){
            this.id = id;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder surname(String surname){
            this.surname = surname;
            return this;
        }


        public Admin build(){ return new Admin(this);}
    }

}
