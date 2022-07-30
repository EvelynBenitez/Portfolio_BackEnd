package com.portfolioEvelyn.miportfolio.service;

import com.portfolioEvelyn.miportfolio.model.Dto.Dto;
import com.portfolioEvelyn.miportfolio.model.Usuario;
import com.portfolioEvelyn.miportfolio.repository.authRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    authRepository repository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public boolean IsUserEnabled(Dto userDto) {
        boolean IsUserEnabled = false;
        List<Usuario> usuarios = repository.findByEmailAndHabilitadoTrue(userDto.getEmail());
        if (!usuarios.isEmpty()) {
            Usuario usuario = usuarios.get(0);
            if (passwordEncoder.matches(userDto.getPassword(), usuario.getPassword())) {
                IsUserEnabled = true;
            }
        }
        return IsUserEnabled;
    }

    public void crearUsuario(Usuario usuario) throws Exception {
        List<Usuario> usuarios = repository.findByEmailAndHabilitadoTrue(usuario.getEmail());
        if (!usuarios.isEmpty())
        throw new Exception("El email ya fue registrado");
        else{
            usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
            usuario.setHabilitado(true);
            repository.save(usuario);
        } 
    }
}
