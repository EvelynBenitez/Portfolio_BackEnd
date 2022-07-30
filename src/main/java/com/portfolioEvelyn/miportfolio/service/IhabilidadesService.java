package com.portfolioEvelyn.miportfolio.service;

import com.portfolioEvelyn.miportfolio.model.Habilidad;
import java.util.List;


public interface IhabilidadesService {
   
   public List<Habilidad> VerHabilidades ();
   public Habilidad crearHabilidad (Habilidad habi);
   public void borrarHabilidad (Long id);
   public Habilidad encontrarHabilidades (Long id);
   public void modificarHabilidad (Habilidad habi);
}
