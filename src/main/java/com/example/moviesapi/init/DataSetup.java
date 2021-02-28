package com.example.moviesapi.init;

import com.example.moviesapi.entity.MovieEntity;
import com.example.moviesapi.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class DataSetup {

    private final MovieRepository movieRepository;

    @PostConstruct
    public void setupData() {
        MovieEntity movie = new MovieEntity();
        movie.setId(1L);
        movie.setTitle("Batman Returns");
        movie.setDirectorName("Tim Burton");
        movie.setReleaseDate(LocalDate.of(1992, 6, 19));
        movieRepository.save(movie);
    }

}
