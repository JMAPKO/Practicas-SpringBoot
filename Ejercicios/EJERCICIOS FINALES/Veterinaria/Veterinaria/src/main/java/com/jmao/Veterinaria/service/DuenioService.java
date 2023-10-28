
package com.jmao.Veterinaria.service;

import com.jmao.Veterinaria.dto.MascotaDTO;
import com.jmao.Veterinaria.model.Duenio;
import com.jmao.Veterinaria.repository.IDuenioRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DuenioService implements IDuenioService {

   @Autowired
   IDuenioRepository duenioRepo;
    
   @Override
    public List<Duenio> getsDuenios() {
        return duenioRepo.findAll();
    }

    @Override
    public void saveDuenio(Duenio due) {
        duenioRepo.save(due);
    }

    @Override
    public void deleteDuenio(Long id) {
        duenioRepo.deleteById(id);
    }

    @Override
    public Duenio getDuenio(Long id) {
        Duenio due = duenioRepo.findById(id).orElse(null);
        return due;
    }

    @Override
    public void editDuenio(Duenio due) {
       this.saveDuenio(due);
    }

    @Override
    public List<MascotaDTO> MascoDuenio(){ 
    List <Duenio> listaDuenio = this.getsDuenios();
       List <MascotaDTO> listaMascoDuenio = new ArrayList();
       MascotaDTO mascoDuenio = new MascotaDTO();
        
       for(Duenio due:listaDuenio){
           if(due.getMasco() != null){
            mascoDuenio.setNombre_mascota(due.getMasco().getNombre());
            mascoDuenio.setEspecie(due.getMasco().getEspecie());
            mascoDuenio.setRaza(due.getMasco().getRaza());
            mascoDuenio.setNombre_duenio(due.getNombre());
            mascoDuenio.setApellido_duenio(due.getApellido());
           
            listaMascoDuenio.add(mascoDuenio);
            mascoDuenio = new MascotaDTO(); //reset;
           }
        }
       
       return listaMascoDuenio;
    }
  

  }


