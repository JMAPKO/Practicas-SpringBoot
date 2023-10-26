
package com.JMAO.practicaUnoJpa.repository;

import com.JMAO.practicaUnoJpa.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Long> {
    
}
