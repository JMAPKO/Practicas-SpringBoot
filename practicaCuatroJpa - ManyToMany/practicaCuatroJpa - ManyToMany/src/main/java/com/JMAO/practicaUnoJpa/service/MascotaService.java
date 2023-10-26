
package com.JMAO.practicaUnoJpa.service;

import com.JMAO.practicaUnoJpa.model.Mascota;
import com.JMAO.practicaUnoJpa.repository.IMascotaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MascotaService implements IMascotaSerivce {
    
   @Autowired
   IMascotaRepository mascorepo;

    @Override
    public List<Mascota> traerMascotas() {
        List<Mascota> listaMascotas = mascorepo.findAll();
        return listaMascotas;
    }

    @Override
    public void guardarMascota(Mascota masco) {
        mascorepo.save(masco);
    }

    @Override
    public void borrarMascota(Long id) {
        mascorepo.deleteById(id);
    }

    @Override
    public Mascota buscarMascota(Long id) {
        Mascota masco = mascorepo.findById(id).orElse(null);
        return masco;
    }

    @Override
    public void editarMascota(Long idOriginal, Long idNueva, String nuevoNombre, String nuevoEspecie, String nuevoRaza, String nuevoColor) {
        Mascota masco = this.buscarMascota(idOriginal) ;
        masco.setId_mascota(idNueva);
        masco.setNombre(nuevoNombre);
        masco.setEspecie(nuevoEspecie);
        masco.setColor(nuevoColor);
        masco.setRaza(nuevoRaza);
        
        this.guardarMascota(masco);
    }

   
    
}
