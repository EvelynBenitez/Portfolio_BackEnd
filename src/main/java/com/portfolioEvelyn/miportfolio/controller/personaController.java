package com.portfolioEvelyn.miportfolio.controller;

import com.portfolioEvelyn.miportfolio.model.Persona;
import com.portfolioEvelyn.miportfolio.service.IpersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class personaController {
    
    @Autowired
    
    private IpersonaService persoServ;
    
    @PostMapping ("persona/new")
    public void agregarPersona (@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }
    
    @GetMapping ("persona/ver")
    @ResponseBody
    public List <Persona> verPersona () {
        return persoServ.VerPersona();
    }
    @DeleteMapping ("persona/delete/{id}")
    public void borrarPersona (@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    
    @PutMapping ("persona/modificar")
    public void modificarPersona (@RequestBody Persona pers){
        persoServ.modificarPersona(pers);
    }
}