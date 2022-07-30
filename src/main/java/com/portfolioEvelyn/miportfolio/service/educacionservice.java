
package com.portfolioEvelyn.miportfolio.service;

import com.portfolioEvelyn.miportfolio.model.Educacion;
import com.portfolioEvelyn.miportfolio.repository.educacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class educacionservice implements IeducacionService{
    
    @Autowired
    public educacionRepository eduRepo; 
    
    @Override
    public List<Educacion> VerEducacion() {
        return eduRepo.findAll();
    }

    @Override
    public Educacion crearEducacion(Educacion edu) {
       return eduRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion encontrarEducacion(Long id) {
        return eduRepo.findById(id).orElse(null);
    }
    
    @Override
    public void modificarEducacion (Educacion edu){
        eduRepo.save(edu);
    }
}
