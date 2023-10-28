
package com.jmao.Veterinaria.service;

import com.jmao.Veterinaria.dto.MascotaDTO;
import com.jmao.Veterinaria.model.Mascota;
import com.jmao.Veterinaria.repository.IMascotaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService{
    
    @Autowired
    IMascotaRepository mascoRepo;

    @Override
    public List<Mascota> getsMascotas() {
        return mascoRepo.findAll();
    }

    @Override
    public void saveMascota(Mascota masco) {
        mascoRepo.save(masco);
    }

    @Override
    public void deleteMascota(Long id) {
        mascoRepo.deleteById(id);
    }

    @Override
    public Mascota getMascota(Long id) {
        Mascota masco = mascoRepo.findById(id).orElse(null);
        return masco;
    }

    @Override
    public void editMascota(Mascota due) {
        this.saveMascota(due);
    }

    @Override
    public List<Mascota> traerCaniches() {
        String clave1= "perro";
        String clave2= "caniche";
        String condicion1;
        String condicion2;
        
       List<Mascota> listaMascotas = this.getsMascotas();
       List<Mascota> listaCaniches = new ArrayList<>();
       
       for(Mascota masco:listaMascotas){
           condicion1 = masco.getEspecie().toLowerCase();
           condicion2= masco.getRaza().toLowerCase();
           boolean esPerro= condicion1.contains(clave1);
           boolean esCaniche= condicion2.contains(clave2);
           
           if(esPerro ==true && esCaniche==true){
               listaCaniches.add(masco);
           }
                      
        }
       return listaCaniches;
    }
    
   
    
  }
