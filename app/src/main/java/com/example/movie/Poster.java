package com.example.movie;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Poster implements Serializable {
    @SerializedName("url")
    private String Url;

    public void setUrl(String url) {
        Url = url;
    }

    public Poster(){
    }
    public Poster(String url) {
        this.Url = url;
    }

    public String getUrl() {
        if (Url == null) {
            Url = "";
        }
        return Url;
    }

    @Override
    public String toString() {
        return "Poster{" +
                "Url='" + Url + '\'' +
                '}';
    }
}
