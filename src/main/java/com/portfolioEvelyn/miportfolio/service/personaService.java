package com.portfolioEvelyn.miportfolio.service;

import com.portfolioEvelyn.miportfolio.model.Persona;
import com.portfolioEvelyn.miportfolio.repository.personaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class personaService implements IpersonaService {
    
    @Autowired
    public personaRepository persoRepo;
    
    @Override
    public List<Persona> VerPersona() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona pers) {
        persoRepo.save(pers);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona encontrarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }
    
    @Override
    public void modificarPersona (Persona pers){
        persoRepo.save(pers);
    }
}
