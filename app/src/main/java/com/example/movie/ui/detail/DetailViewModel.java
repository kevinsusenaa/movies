package com.example.movie.ui.detail;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.movie.model.local.Cast;
import com.example.movie.model.local.Genre;
import com.example.movie.repository.MovieRepository;
import com.example.movie.repository.TvShowRepository;

import java.util.List;

public class DetailViewModel extends ViewModel {

    private MovieRepository movieRepository;
    private TvShowRepository tvShowRepository;

    public DetailViewModel() {
        movieRepository = MovieRepository.getInstance();
        tvShowRepository = TvShowRepository.getInstance();
    }

    public LiveData<List<Genre>> getMovieGenre(int id) {
        return movieRepository.getGenres(id);
    }

    public LiveData<List<Cast>> getMovieCast(int id) {
        return movieRepository.getCasts(id);
    }

    public LiveData<List<Genre>> getShowGenre(int id) {
        return tvShowRepository.getGenres(id);
    }

    public LiveData<List<Cast>> getShowCast(int id) {
        return tvShowRepository.getCasts(id);
    }
}
