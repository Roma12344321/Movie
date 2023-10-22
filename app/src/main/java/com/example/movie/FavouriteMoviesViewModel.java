package com.example.movie;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class FavouriteMoviesViewModel extends AndroidViewModel {
    private MovieDao movieDao;
    public LiveData<List<Movie>> getAllFavouriteMovies(){
        return movieDao.getAllFavouriteMovies();
    }
    public FavouriteMoviesViewModel(@NonNull Application application) {
        super(application);
        movieDao = MovieDataBase.getInstance(application).movieDao();
    }
}