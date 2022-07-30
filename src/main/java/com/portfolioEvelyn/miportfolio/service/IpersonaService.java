package com.portfolioEvelyn.miportfolio.service;

import com.portfolioEvelyn.miportfolio.model.Persona;
import java.util.List;

public interface IpersonaService {
   public List<Persona> VerPersona ();
   public void crearPersona (Persona pers);
   public void borrarPersona (Long id);
   public Persona encontrarPersona (Long id);
   public void modificarPersona (Persona pers);
}
