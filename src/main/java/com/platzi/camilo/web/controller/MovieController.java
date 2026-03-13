package com.platzi.camilo.web.controller;

import com.platzi.camilo.persistence.crud.CrudMovieEntity;
import com.platzi.camilo.persistence.entity.MovieEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//Spring escanea el proyecto y detecta clases con anotaciones como @Repository para acceso a datos, @Service para lógica de negocio, @Controller y @RestController para la exposición web, y @Component para componentes genéricos.
@RestController // Anotación que indica que esta clase es un controlador REST, lo que significa que manejará solicitudes HTTP y devolverá respuestas en formato JSON o XML.
public class MovieController {

    private final CrudMovieEntity crudMovieEntity;

    public MovieController(CrudMovieEntity crudMovieEntity) {
        this.crudMovieEntity = crudMovieEntity;
    }

    @GetMapping("/movies") // Se encarga de traer todas las peliculas que tenga en la base de datos y por medio del endpoint al buscarlo en la url del navegador me las va a mostrar en formato JSON
    public List<MovieEntity> getAll() {
        return (List<MovieEntity>) this.crudMovieEntity.findAll();
    }
}
