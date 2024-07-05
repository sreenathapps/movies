package com.example.movie;

import java.util.ArrayList;

public interface MovieRepository {
    ArrayList<Movie> getMovies();
    Movie addMovie(Movie movie);
    Movie updateMovie(int movieId, Movie movie);
    Movie getMovieById(int movieId);
    void deleteMovie(int movieId);
}