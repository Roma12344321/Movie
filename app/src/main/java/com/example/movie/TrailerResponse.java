package com.example.movie;

import com.google.gson.annotations.SerializedName;

public class TrailerResponse {
    @SerializedName("videos")
    private TrailersList trailersList;

    public TrailerResponse(TrailersList videos) {
        this.trailersList = videos;
    }

    public TrailersList getVideos() {
        return trailersList;
    }

    @Override
    public String toString() {
        return "TrailerResponse{" +
                "trailersList=" + trailersList +
                '}';
    }
}
