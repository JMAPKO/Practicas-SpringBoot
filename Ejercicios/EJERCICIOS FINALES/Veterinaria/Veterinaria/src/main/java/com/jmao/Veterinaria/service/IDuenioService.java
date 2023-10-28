
package com.jmao.Veterinaria.service;

import com.jmao.Veterinaria.dto.MascotaDTO;
import com.jmao.Veterinaria.model.Duenio;
import java.util.List;

public interface IDuenioService {
   
   //METODO TRAER TODOS DUENIOS: 
   public List<Duenio> getsDuenios();
   
   //METODO CREAR DUENIOS:
   public void saveDuenio(Duenio due);
   
   //METODO BORRAR DUENIO:
   public void deleteDuenio (Long id);
   
   //METODO TRAER 1 DUENIO:
   public Duenio getDuenio(Long id);
   
   //METODO EDITAR DUENIO:
   public void editDuenio(Duenio due);
   
   //METODO COMBINAR LISTAS DTO
   public List<MascotaDTO> MascoDuenio();
   
    
 }
