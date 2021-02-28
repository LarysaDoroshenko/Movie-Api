package com.example.moviesapi.service;

import com.example.moviesapi.dto.MovieRequestDto;
import com.example.moviesapi.dto.MovieResponseDto;

public interface MovieService {

    MovieResponseDto getMovieById(Long id);

    MovieResponseDto create(MovieRequestDto movieRequestDto);

}
