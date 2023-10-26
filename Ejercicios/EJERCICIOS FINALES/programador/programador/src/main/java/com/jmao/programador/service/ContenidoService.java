
package com.jmao.programador.service;

import com.jmao.programador.model.Contenido;
import com.jmao.programador.repository.IContenidoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ContenidoService implements IContenidoService {
    
   @Autowired
   IContenidoRepository contRepo;
   

   @Override
    public void saveContenido(Contenido cont) {
       contRepo.save(cont);
    }

    @Override
    public List<Contenido> mostrarTemas() {
        List<Contenido> listaTemas = contRepo.findAll();
        return listaTemas;
    }

    @Override
    public void borrarContenido(int id) {
       contRepo.deleteById(id);
    }

    @Override
    public Contenido traerTema(int id) {
        Contenido cont= contRepo.findById(id).orElse(null);
        return cont;
    }

    @Override
    public void editarTema(Contenido cont) {
       this.saveContenido(cont);
    }
    
}
