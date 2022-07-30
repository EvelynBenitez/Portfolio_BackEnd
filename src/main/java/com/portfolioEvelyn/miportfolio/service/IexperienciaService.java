package com.portfolioEvelyn.miportfolio.service;

import com.portfolioEvelyn.miportfolio.model.Experiencia;
import java.util.List;

public interface IexperienciaService {
   public List<Experiencia> VerExperiencia ();
   public Experiencia crearExperiencia (Experiencia exp);
   public void borrarExperiencia (Long id);
   public Experiencia encontrarExperiencia (Long id);
   public void modificarExperiencia (Experiencia exp);
}
