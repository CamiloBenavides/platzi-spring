package com.platzi.camilo.domain.repository;

import com.platzi.camilo.domain.dto.MovieDto;

import java.util.List;

public interface MovieRepository {
    List<MovieDto> getAll();
}
