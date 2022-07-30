
package com.portfolioEvelyn.miportfolio.controller;

import com.portfolioEvelyn.miportfolio.model.Dto.Dto;
import com.portfolioEvelyn.miportfolio.model.Usuario;
import com.portfolioEvelyn.miportfolio.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class authController {
    @Autowired
    AuthService service;
    
    @PostMapping("/login")   
    public boolean login (@RequestBody Dto Dto){
        return service.IsUserEnabled(Dto);
    }
    
    @PostMapping("/register")
    public void register(@RequestBody Usuario usuario) throws Exception {
        service.crearUsuario(usuario);
    }
}
