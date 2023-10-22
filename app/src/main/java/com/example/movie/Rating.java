package com.example.movie;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Rating implements Serializable {
    @SerializedName("kp")
    private double kp;

    public void setKp(double kp) {
        this.kp = kp;
    }

    public Rating(double kp) {
        this.kp = kp;
    }

    public double getKp() {
        return kp;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "kp='" + kp + '\'' +
                '}';
    }
}