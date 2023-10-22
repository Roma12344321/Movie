package com.example.movie;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @Headers({
            "Accept: application/json",
            "X-API-KEY: JQM6HXA-RMRMH1E-PW9EPFF-510D21A"
    })

    @GET("movie?token=JQM6HXA-RMRMH1E-PW9EPFF-510D21A&field=rating.kp&search=7-10&sortField=votes.kp&sortType=-1&limit=40")
    Single<MovieResponse> loadMovies(@Query("page") int page);
    @GET("movie/{idFilms}?token=JQM6HXA-RMRMH1E-PW9EPFF-510D21A")
    Single<TrailerResponse> loadTrailers(@Path("idFilms") int idFilms);
}