
package com.jmao.Veterinaria.service;

import com.jmao.Veterinaria.model.Mascota;
import java.util.List;

public interface IMascotaService {
    
       //METODO TRAER TODOS Masco: 
   public List<Mascota> getsMascotas();
   
   //METODO CREAR Masco:
   public void saveMascota(Mascota masco);
   
   //METODO BORRAR masco:
   public void deleteMascota (Long id);
   
   //METODO TRAER 1 Masco
   public Mascota getMascota(Long id);
   
   //METODO EDITAR Masco:
   public void editMascota(Mascota due);
   
   //METODO PARA TRAER SOLAMENTE DE PERRO Y CANICHE
   public List<Mascota> traerCaniches();
   

    
 }
