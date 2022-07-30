
package com.portfolioEvelyn.miportfolio.repository;

import com.portfolioEvelyn.miportfolio.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface educacionRepository extends JpaRepository <Educacion, Long>{
}
