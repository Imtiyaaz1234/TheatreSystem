package com.TPFinalGroupAssign.TheatreSystem.Domain;


import com.TPFinalGroupAssign.TheatreSystem.Domain.Impl.Movie_Genre;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Horror implements Movie_Genre {
    @Id
    @GeneratedValue
    private Long movieId;
    private int duration;
    private String title;

    public Horror()
    {

    }

    public Long getMovieId()
    {
        return movieId;
    }

    public int getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }

    public Long getMovie_Id() {
        return null;
    }


    public Horror(Builder builder){
        this.movieId = builder.movieId;
        this.duration = builder.duration;
        this.title = builder.title;
    }

    public static class Builder{

        private Long movieId;
        private String title;
        private int duration;


        public Builder movieId(Long movieId) {
            this.movieId = movieId;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder duration(int duration) {
            this.duration = duration;
            return this;
        }


        public Horror build(){
            return  new Horror(this);
        }
    }
}
