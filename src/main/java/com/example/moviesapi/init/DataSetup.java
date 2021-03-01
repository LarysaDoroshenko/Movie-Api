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
        MovieEntity movie1 = new MovieEntity();
        movie1.setId(1L);
        movie1.setTitle("Batman Returns");
        movie1.setDirectorName("Tim Burton");
        movie1.setReleaseDate(LocalDate.of(1992, 6, 19));
        movieRepository.save(movie1);

        MovieEntity movie2 = new MovieEntity();
        movie2.setId(3L);
        movie2.setTitle("The Dark Knight Rises");
        movie2.setDirectorName("Christopher Nolan");
        movie2.setReleaseDate(LocalDate.of(2012, 7, 16));
        movieRepository.save(movie2);
    }

}
