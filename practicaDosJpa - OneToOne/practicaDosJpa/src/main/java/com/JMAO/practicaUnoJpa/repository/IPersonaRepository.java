
package com.JMAO.practicaUnoJpa.repository;
import com.JMAO.practicaUnoJpa.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
}
