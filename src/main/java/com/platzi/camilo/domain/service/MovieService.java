package com.platzi.camilo.domain.service;

import com.platzi.camilo.domain.dto.MovieDto;
import com.platzi.camilo.domain.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

        public List<MovieDto> getAll() {
        return this.movieRepository.getAll();
        }
}
