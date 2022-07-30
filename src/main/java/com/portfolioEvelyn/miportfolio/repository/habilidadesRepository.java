package com.portfolioEvelyn.miportfolio.repository;

import com.portfolioEvelyn.miportfolio.model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface habilidadesRepository extends JpaRepository <Habilidad, Long>{
    
}
