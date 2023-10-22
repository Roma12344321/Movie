package com.example.movie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import java.util.List;

public class FavoriteMovies extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_movies);
        MovieAdapter movieAdapter = new MovieAdapter();
        RecyclerView recyclerViewMovies = findViewById(R.id.recyclerViewFav);
        recyclerViewMovies.setAdapter(movieAdapter);
        recyclerViewMovies.setLayoutManager(new GridLayoutManager(this, 2));
        FavouriteMoviesViewModel viewModel = new ViewModelProvider(this).get(FavouriteMoviesViewModel.class);
        viewModel.getAllFavouriteMovies().observe(this, new Observer<List<Movie>>() {
            @Override
            public void onChanged(List<Movie> movies) {
                movieAdapter.setMovies(movies);
            }
        });
        movieAdapter.setClickIntent(new MovieAdapter.ClickIntent() {
            @Override
            public void clickIntent(Movie movie) {
                Intent intent = MovieDetailActivity.newIntent(FavoriteMovies.this, movie);
                startActivity(intent);
            }
        });
    }
    public static Intent newIntent(Context context){
        return new Intent(context,FavoriteMovies.class);
    }
}