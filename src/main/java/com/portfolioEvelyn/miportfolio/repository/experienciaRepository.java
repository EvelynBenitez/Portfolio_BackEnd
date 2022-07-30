package com.portfolioEvelyn.miportfolio.repository;

import com.portfolioEvelyn.miportfolio.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface experienciaRepository extends JpaRepository <Experiencia, Long>{    
}
