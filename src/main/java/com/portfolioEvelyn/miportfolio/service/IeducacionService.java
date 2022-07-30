
package com.portfolioEvelyn.miportfolio.service;

import com.portfolioEvelyn.miportfolio.model.Educacion;
import java.util.List;


public interface IeducacionService {
   public List<Educacion> VerEducacion ();
   public Educacion crearEducacion (Educacion edu);
   public void borrarEducacion (Long id);
   public Educacion encontrarEducacion (Long id);
   public void modificarEducacion (Educacion edu);
}
