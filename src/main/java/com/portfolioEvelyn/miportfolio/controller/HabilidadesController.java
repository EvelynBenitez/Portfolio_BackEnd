package com.portfolioEvelyn.miportfolio.controller;

import com.portfolioEvelyn.miportfolio.model.Habilidad;
import com.portfolioEvelyn.miportfolio.service.IhabilidadesService;
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
public class HabilidadesController {
    @Autowired
    
    private IhabilidadesService habiServ;
    
    @PostMapping ("habilidades/new")
    public Habilidad agregarHabilidad (@RequestBody Habilidad habi){
        return habiServ.crearHabilidad(habi);
    }
    
    @GetMapping ("habilidades/ver")
    @ResponseBody
    public List <Habilidad> verHabilidades () {
        return habiServ.VerHabilidades();
    }
    @DeleteMapping ("habilidades/delete/{id}")
    public void borrarHabilidad (@PathVariable Long id){
        habiServ.borrarHabilidad(id);
    }
    
    @PutMapping ("habilidades/modificar")
    public void modificarHabilidad (@RequestBody Habilidad habi){
        habiServ.modificarHabilidad(habi);
    }
}
