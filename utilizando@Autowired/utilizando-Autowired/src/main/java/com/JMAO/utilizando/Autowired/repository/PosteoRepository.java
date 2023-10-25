
package com.JMAO.utilizando.Autowired.repository;

import com.JMAO.utilizando.Autowired.model.Posteo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class PosteoRepository implements IPosteoRepository{

    @Override
    public List<Posteo> traerPosteos() {
        List<Posteo> listaPosteos = new ArrayList<Posteo>();
        listaPosteos.add(new Posteo(1L,"tecnicas para reducir al oponente","Franco mamamni"));
        listaPosteos.add(new Posteo(2L, "Formas de respiracion", "Ignacio Castillo"));
        
        return listaPosteos;
    }

 
    
}
