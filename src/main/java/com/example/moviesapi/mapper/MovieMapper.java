package com.example.moviesapi.mapper;

import com.example.moviesapi.dto.MovieRequestDto;
import com.example.moviesapi.dto.MovieResponseDto;
import com.example.moviesapi.entity.MovieEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MovieMapper {

    MovieResponseDto movieEntityToMovieResponseDto(MovieEntity movieEntity);

    MovieEntity movieRequestDtoToMovieEntity(MovieRequestDto movieRequestDto);

}
