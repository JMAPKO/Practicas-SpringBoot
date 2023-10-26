
package com.jmao.programador.repository;

import com.jmao.programador.model.Taller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITallerRepository extends JpaRepository<Taller, Long>{
    
}
