package com.TPFinalGroupAssign.TheatreSystem.Domain;


import javax.management.relation.Role;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Users {

    @Id
    @GeneratedValue
    private Long userId;
    private String name;
    private String surname;
    private String email;
    private Role role;
    private Boolean isAuthenticated;

    public Users(){

    }

    public Users(Builder builder){
        this.userId = builder.userId;
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
        this.isAuthenticated = builder.isAuth;
    }

    public Long getUserID() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public Role getRole() {
        return role;
    }

    public Boolean getAuthenticated() {
        return isAuthenticated;
    }

    public static class Builder{
        private Long userId;
        private String name;
        private String surname;
        private String email;
        private Boolean isAuth;

        public Builder userId(Long userId){
            this.userId = userId;
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

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder boolen() {
            return boolen();
        }

        public Builder boolen(Boolean bl){
            this.isAuth = bl;
            return this;
        }

        public Users build(){ return new Users(this);}
    }
}
