package com.platzi.camilo.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name="platzi_camilo_peliculas")
@Data 
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length=150,unique=true)
    private String title;

    @Column(nullable = false,precision = 3)
    private Integer duration;

    @Column(nullable = false,length=40)
    private String genero;

    @Column(name="fecha_estreno")
    private LocalDate fechaEstreno;

    @Column(precision=3,scale=2)
    private BigDecimal clasificacion;

    @Column(nullable=false,length=1)
    private String estado;
}
