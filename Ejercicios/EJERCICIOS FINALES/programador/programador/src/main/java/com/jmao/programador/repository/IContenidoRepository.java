
package com.jmao.programador.repository;

import com.jmao.programador.model.Contenido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContenidoRepository extends JpaRepository<Contenido, Integer> {
    
}
