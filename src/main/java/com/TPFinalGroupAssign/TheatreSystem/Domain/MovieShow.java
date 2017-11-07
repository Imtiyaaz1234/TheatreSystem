package com.TPFinalGroupAssign.TheatreSystem.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class MovieShow {

    private Long sId;
    private int mId;
    private Date date;
    private String time;
    private int seatingId;

    public Long getsId() {
        return sId;
    }

    public int getmId() {
        return mId;
    }

    public Date getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public int getSeatingId() {
        return seatingId;
    }

    public MovieShow(Builder builder){
        this.sId = builder.sId;
        this.mId = builder.mId;
        this.date = builder.date;
        this.time = builder.time;
        this.seatingId = builder.seatingId;
    }

    public static class Builder {
        private Long sId;
        private int mId;
        private Date date;
        private String time;
        private int seatingId;

        public Builder sId(Long sId){
            this.sId = sId;
            return this;
        }

        public Builder mId(int mId){
            this.mId = mId;
            return this;
        }

        public Builder date(Date date){
            this.date = date;
            return this;
        }

        public Builder time(String time){
            this.time = time;
            return this;
        }

        public Builder seatingId(int seatingId){
            this.seatingId = seatingId;
            return this;
        }

        public MovieShow build(){ return new MovieShow(this);}


    }
}