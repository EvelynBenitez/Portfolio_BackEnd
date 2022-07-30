
package com.portfolioEvelyn.miportfolio.repository;

import com.portfolioEvelyn.miportfolio.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface authRepository extends JpaRepository<Usuario, Long>{
    List<Usuario> findByEmailAndHabilitadoTrue(String email);
}
