package com.portfolioEvelyn.miportfolio.controller;

import com.portfolioEvelyn.miportfolio.model.Educacion;
import com.portfolioEvelyn.miportfolio.service.IeducacionService;
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
public class educacionController {
    
    @Autowired
    
    private IeducacionService eduServ;
    
    @PostMapping ("educacion/new")
    public Educacion agregarEducacion (@RequestBody Educacion edu){
        return eduServ.crearEducacion(edu);
    }
    
    @GetMapping ("educacion/ver")
    @ResponseBody
    public List <Educacion> verEducaciones () {
        return eduServ.VerEducacion();
    }
    @DeleteMapping ("educacion/delete/{id}")
    public void borrarEducacion (@PathVariable Long id){
        eduServ.borrarEducacion(id);
    }
    
    @PutMapping ("educacion/modificar")
    public void modificarEducacion (@RequestBody Educacion edu){
        eduServ.modificarEducacion(edu);
    }
}
