package com.portfolioEvelyn.miportfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    @javax.persistence.Id
    private Long id;
    private String titulo;
    private String institucion;
    private String descripcion;
    private String periodo;
    private String imagen;

public Educacion(){
}

public Educacion(Long id, String titulo, String institucion, String descripcion, String periodo, String imagen){ 
    this.id= id;
    this.titulo= titulo;
    this.institucion = institucion;
    this.descripcion = descripcion;
    this.periodo = periodo;      
    this.imagen = imagen;
}

}

