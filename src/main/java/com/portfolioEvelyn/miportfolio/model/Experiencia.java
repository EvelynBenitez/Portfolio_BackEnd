
package com.portfolioEvelyn.miportfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    @javax.persistence.Id
    private Long id;
    private String puesto;
    private String empresa;
    private String descripcion;
    private String periodo;
    private String imagen;
    
    public Experiencia(){
}

    public Experiencia(Long id, String puesto, String empresa, String descripcion, String periodo, String imagen){ 
    this.id= id;
    this.puesto= puesto;
    this.empresa = empresa;
    this.descripcion = descripcion;
    this.periodo = periodo;   
    this.imagen = imagen;
}
}
