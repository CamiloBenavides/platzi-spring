package com.platzi.camilo.persistence;

import com.platzi.camilo.domain.dto.MovieDto;
import com.platzi.camilo.domain.repository.MovieRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieEntityRepository implements MovieRepository {

    private final CrudMovieEntity crudMovieEntity;

    @Override
    public List<MovieDto> getAll() {
        return List.of();
    }
}
