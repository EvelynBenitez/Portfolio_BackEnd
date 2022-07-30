package com.portfolioEvelyn.miportfolio.controller;

import com.portfolioEvelyn.miportfolio.model.Experiencia;
import com.portfolioEvelyn.miportfolio.service.IexperienciaService;
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
public class experienciaController {
    
    @Autowired
    
    private IexperienciaService  expServ;
    
    @PostMapping ("experiencia/new")
    public Experiencia agregarExperiencia (@RequestBody Experiencia exp){
        return expServ.crearExperiencia(exp);
    }
    
    @GetMapping ("experiencia/ver")
    @ResponseBody
    public List <Experiencia> verEdxperiencias () {
        return expServ.VerExperiencia();
    }
    @DeleteMapping ("experiencia/delete/{id}")
    public void borrarExperiencia (@PathVariable Long id){
        expServ.borrarExperiencia(id);
    }
    
    @PutMapping ("experiencia/modificar")
    public void modificarExperiencia (@RequestBody Experiencia exp){
        expServ.modificarExperiencia(exp);
    }
}
