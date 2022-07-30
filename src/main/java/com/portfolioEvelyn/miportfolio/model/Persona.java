package com.portfolioEvelyn.miportfolio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    @javax.persistence.Id
    private Long id;
    private String nombre;
    private String profesion;
    @Column(length = 500)
    private String sobreMi;
    private String imagen;
    
    public Persona (){
    }
    
    public Persona(Long id, String nombre, String profesion, String sobreMi, String imagen){ 
    this.id= id;
    this.nombre= nombre;
    this.profesion = profesion;
    this.sobreMi = sobreMi;
    this.imagen = imagen;
    }
}
