// Write your code here
package com.example.movie;

import java.util.List;

public interface MovieRepository {
    List<Movie> getAllMovies();
    void addMovie(Movie movie);
    Movie getMovieById(int movieId);
    void updateMovie(Movie movie);
    void deleteMovie(int movieId);
}