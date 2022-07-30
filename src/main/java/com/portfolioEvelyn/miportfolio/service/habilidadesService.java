package com.portfolioEvelyn.miportfolio.service;

import com.portfolioEvelyn.miportfolio.model.Habilidad;
import com.portfolioEvelyn.miportfolio.repository.habilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class habilidadesService implements IhabilidadesService{
    @Autowired
    public habilidadesRepository habiRepo; 
    
    @Override
    public List<Habilidad> VerHabilidades() {
        return habiRepo.findAll();
    }

    @Override
    public Habilidad crearHabilidad(Habilidad habi) {
       return habiRepo.save(habi);
    }

    @Override
    public void borrarHabilidad(Long id) {
        habiRepo.deleteById(id);
    }

    @Override
    public Habilidad encontrarHabilidades(Long id) {
        return habiRepo.findById(id).orElse(null);
    }
    
    @Override
    public void modificarHabilidad (Habilidad habi){
        habiRepo.save(habi);
    }
    
}
