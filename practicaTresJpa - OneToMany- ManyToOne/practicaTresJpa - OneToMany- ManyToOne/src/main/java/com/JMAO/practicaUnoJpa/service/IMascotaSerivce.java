
package com.JMAO.practicaUnoJpa.service;

import com.JMAO.practicaUnoJpa.model.Mascota;
import java.util.List;

public interface IMascotaSerivce {
    
   //METODO PARA TRAER MASCOTAS
    public List<Mascota> traerMascotas();
    
   //METODO PARA CREAR MASCOTAS
    public void guardarMascota(Mascota masco);
    
   //METODO PARA BORRAR MASCOTAS
    public void borrarMascota(Long id);
    
    
   //METODO PARA BUSCAR UNA SOLA MASCOTA
    public Mascota buscarMascota(Long id);
    
    
   //METODO PARA EDITAR MASCOTAS
    public void editarMascota (Long idOriginal,
                               Long idNueva,
                               String nuevoNombre,
                               String nuevoEspecie,
                               String nuevoRaza,
                               String nuevoColor);
    
 }
