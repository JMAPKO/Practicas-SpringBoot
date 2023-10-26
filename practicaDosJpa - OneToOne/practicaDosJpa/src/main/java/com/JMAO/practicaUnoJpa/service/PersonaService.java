
package com.JMAO.practicaUnoJpa.service;

import com.JMAO.practicaUnoJpa.model.Mascota;
import com.JMAO.practicaUnoJpa.model.Persona;
import com.JMAO.practicaUnoJpa.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    
   @Autowired
   private IPersonaRepository persoRepository;

    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = persoRepository.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(Persona perso) {
        persoRepository.save(perso);
        
    }

    @Override
    public void deletePersona(Long id) {
        persoRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona perso = persoRepository.findById(id).orElse(null);
        return perso;
    }

    @Override
    public void editPersona(Long idOriginal, Long idNueva, String nuevoNombre, String nuevoApellido, int nuevaEdad, Mascota nuevaMascota) {
            //BUSCAR elobjeto original:
        
       Persona perso = this.findPersona(idOriginal);
       
       perso.setId(idNueva);
       perso.setNombre(nuevoNombre);
       perso.setApellido(nuevoApellido);
       perso.setEdad(nuevaEdad);
       perso.setUnaMascota(nuevaMascota);
       
       //guardar los cambios:
       this.savePersona(perso);

    }

    @Override
    public void editPersona(Persona per) {
       this.savePersona(per);
    }

    

   
    
    
    
 }
