
package com.portfolioEvelyn.miportfolio.repository;

import com.portfolioEvelyn.miportfolio.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personaRepository extends JpaRepository <Persona, Long>{
    
}
