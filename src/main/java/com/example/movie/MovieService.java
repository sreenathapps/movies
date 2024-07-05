package com.example.movie;

import com.example.movie.Movie;
import com.example.movie.MovieRepository;

import java.util.*;

public class MovieService implements MovieRepository {

    private static HashMap<Integer, Movie> movieList = new HashMap<>();
    private static int movieIdCounter = 6;

    public MovieService() {
        movieList.put(1, new Movie(1, "Avengers: Endgame", "Robert Downey Jr."));
        movieList.put(2, new Movie(2, "Avatar", "Sam Worthington"));
        movieList.put(3, new Movie(3, "Titanic", "Leonardo DiCaprio"));
        movieList.put(4, new Movie(4, "Star Wars: The Force Awakens", "Daisy Ridley"));
        movieList.put(5, new Movie(5, "Jurassic World", "Chris Pratt"));
    }

    @Override
    public List<Movie> getAllMovies() {
        return new ArrayList<>(movieList.values());
    }

    @Override
    public void addMovie(Movie movie) {
        movie.setMovieId(movieIdCounter);
        movieList.put(movieIdCounter, movie);
        movieIdCounter++;
    }

    @Override
    public Movie getMovieById(int movieId) {
        return movieList.get(movieId);
    }

    @Override
    public void updateMovie(Movie movie) {
        if (movieList.containsKey(movie.getMovieId())) {
            movieList.put(movie.getMovieId(), movie);
        } else {
            throw new RuntimeException("Movie not found");
        }
    }

    @Override
    public void deleteMovie(int movieId) {
        if (movieList.containsKey(movieId)) {
            movieList.remove(movieId);
        } else {
            throw new RuntimeException("Movie not found");
        }
    }
}