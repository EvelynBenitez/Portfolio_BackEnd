package com.portfolioEvelyn.miportfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@Entity
public class Habilidad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @javax.persistence.Id
    private Long id;
    private String nombre;
    private Float porcentaje;

    public Habilidad() {
    }

    public Habilidad(Long id, String nombre, Float porcentaje) {
        this.id = id;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }
}
