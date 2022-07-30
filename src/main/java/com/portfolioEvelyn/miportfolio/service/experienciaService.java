
package com.portfolioEvelyn.miportfolio.service;

import com.portfolioEvelyn.miportfolio.model.Experiencia;
import com.portfolioEvelyn.miportfolio.repository.experienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class experienciaService implements IexperienciaService{

    @Autowired
    public experienciaRepository expRepo; 
    
    @Override
    public List<Experiencia> VerExperiencia() {
        return expRepo.findAll(); 
    }

    @Override
    public Experiencia crearExperiencia(Experiencia exp) {
        return expRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experiencia encontrarExperiencia(Long id) {
        return expRepo.findById(id).orElse(null);
    }
    
    @Override
    public void modificarExperiencia (Experiencia exp){
        expRepo.save(exp);
    }
}
