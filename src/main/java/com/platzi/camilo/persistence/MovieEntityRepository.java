package com.platzi.camilo.persistence;

import com.platzi.camilo.domain.dto.MovieDto;
import com.platzi.camilo.domain.repository.MovieRepository;
import com.platzi.camilo.domain.service.MovieService;
import com.platzi.camilo.persistence.crud.CrudMovieEntity;
import com.platzi.camilo.persistence.mapper.MovieMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieEntityRepository implements MovieRepository {

    private final CrudMovieEntity crudMovieEntity;
    private final MovieMapper movieMapper;

    public MovieEntityRepository(CrudMovieEntity crudMovieEntity, MovieMapper movieMapper) {
        this.crudMovieEntity = crudMovieEntity;
        this.movieMapper = movieMapper;
    }

    @Override
    public List<MovieDto> getAll() {
        return this.movieMapper.toDto(this.crudMovieEntity.findAll());
    }
}
