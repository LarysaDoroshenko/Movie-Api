package com.example.moviesapi.service;

import com.example.moviesapi.dto.MovieRequestDto;
import com.example.moviesapi.dto.MovieResponseDto;
import com.example.moviesapi.entity.MovieEntity;
import com.example.moviesapi.exception.EntityNotFoundException;
import com.example.moviesapi.mapper.MovieMapper;
import com.example.moviesapi.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;
    private final MovieMapper movieMapper;

    @Override
    public MovieResponseDto getMovieById(Long id) {
        return movieRepository.findById(id)
                              .map(movieMapper::movieEntityToMovieResponseDto)
                              .orElseThrow(() -> new EntityNotFoundException(MovieEntity.class.getSimpleName(), id));
    }

    @Override
    public MovieResponseDto create(MovieRequestDto movieRequestDto) {
        MovieEntity movieEntity = movieMapper.movieRequestDtoToMovieEntity(movieRequestDto);
        MovieEntity savedMovie = movieRepository.save(movieEntity);
        return movieMapper.movieEntityToMovieResponseDto(savedMovie);
    }

}
