package com.platzi.camilo.domain.dto;

import java.time.LocalDate;

// Este tipo de archivo, el record solo se utiliza cuando las clases nunca van a cambiar, y los atributos se agregan como estan en MovieDto
public record MovieDto(
        String title,
        Integer duration,
        String genre,
        LocalDate releaseDate,
        Double rating
) {
}
