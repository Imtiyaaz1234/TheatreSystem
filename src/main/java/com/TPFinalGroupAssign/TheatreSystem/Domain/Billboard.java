package com.TPFinalGroupAssign.TheatreSystem.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Billboard {
    @Id
    @GeneratedValue
    private Long id;
    private String time;
    private Date date;
    private String film;
    private String hall;

    public Billboard()
    {

    }

    public Long getId() {
        return id;
    }

    public String getTime() {
        return time;
    }

    public Date getDate() {
        return date;
    }

    public String getFilm() {
        return film;
    }

    public String getHall() {
        return hall;
    }

    public Billboard(Builder builder){
        this.id = builder.id;
        this.time = builder.time;
        this.date = builder.date;
        this.film = builder.film;
        this.hall = builder.hall;
    }

    public static class Builder {
        private Long id;
        private String time;
        private Date date;
        private String film;
        private String hall;

        public Builder id(Long id)
        {
            this.id = id;
            return this;

        }

        public Builder time(String time)
        {
            this.time = time;
            return this;
        }

        public Builder date(Date date)
        {
            this.date = date;
            return this;
        }

        private Builder film(String film)
        {
            this.film = film;
            return this;
        }

        private Builder hall(String hall)
        {
            this.hall = hall;
            return this;
        }

        public Billboard build(){ return new Billboard(this);}

    }


}